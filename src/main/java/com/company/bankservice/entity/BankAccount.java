package com.company.bankservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@JmixEntity
@Table(name = "BANK_ACCOUNT", indexes = {
        @Index(name = "IDX_BANK_ACCOUNT_CLIENT_ID", columnList = "CLIENT_ID_ID")
})
@Entity
public class BankAccount {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @JoinColumn(name = "CLIENT_ID_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User client_id;

    @Column(name = "AMOUNT", precision = 19, scale = 2)
    private BigDecimal amount;


    @InstanceName
    @Column(name = "NAME")
    private String name;

    public User getClient_id() {
        return client_id;
    }

    public void setClient_id(User client_id) {
        this.client_id = client_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}