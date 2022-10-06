package com.company.bankservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@JmixEntity
@Table(name = "TYPE_", indexes = {
        @Index(name = "IDX_TYPE__CLIENT_ID", columnList = "CLIENT_ID_ID")
})
@Entity(name = "Type_")
public class Type {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @JoinColumn(name = "CLIENT_ID_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Client client_id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JoinTable(name = "TYPE_TRANSACTION_TO_TYPE_LINK",
            joinColumns = @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "TRANSACTION_TO_TYPE_ID", referencedColumnName = "id"))
    @ManyToMany
    private List<TransactionToType> transactionToTypes;

    public List<TransactionToType> getTransactionToTypes() {
        return transactionToTypes;
    }

    public void setTransactionToTypes(List<TransactionToType> transactionToTypes) {
        this.transactionToTypes = transactionToTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient_id() {
        return client_id;
    }

    public void setClient_id(Client client_id) {
        this.client_id = client_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}