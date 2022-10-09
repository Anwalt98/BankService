package com.company.bankservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "TYPE_", indexes = {
        @Index(name = "IDX_TYPE__USER_ID", columnList = "USER_ID_ID")
})
@Entity(name = "Type_")
public class Type {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "USER_ID_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user_id;

    @InstanceName
    @Column(name = "NAME")
    private String name;
    @JoinTable(name = "TRANSACTION_TO_TYPE_TYPE_LINK",
            joinColumns = @JoinColumn(name = "TYPE_ID"),
            inverseJoinColumns = @JoinColumn(name = "TRANSACTION_TO_TYPE_ID"))
    @ManyToMany
    private List<TransactionToType> transactionToTypes;

    public List<TransactionToType> getTransactionToTypes() {
        return transactionToTypes;
    }

    public void setTransactionToTypes(List<TransactionToType> transactionToTypes) {
        this.transactionToTypes = transactionToTypes;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}