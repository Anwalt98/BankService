package com.company.bankservice.entity;

import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.List;

@JmixEntity
@Table(name = "TRANSACTION_TO_TYPE")
@Entity
public class TransactionToType {

    @JoinTable(name = "TRANS_TO_TYPE_TYPE_LINK",
            joinColumns = @JoinColumn(name = "TRANSACTION_TO_TYPE_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Type> type_id;

    @JoinTable(name = "TRANS_TO_TYPE_TRANSACTION_LINK",
            joinColumns = @JoinColumn(name = "TRANSACTION_TO_TYPE_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "TRANSACTION_ID", referencedColumnName = "ID"))
    @ManyToMany
    private List<Transaction> transaction_id;

    @Column(nullable = false)
    @Id
    private Long id;

    public List<Transaction> getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(List<Transaction> transaction_id) {
        this.transaction_id = transaction_id;
    }

    public List<Type> getType_id() {
        return type_id;
    }

    public void setType_id(List<Type> type_id) {
        this.type_id = type_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}