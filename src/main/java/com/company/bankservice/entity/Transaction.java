package com.company.bankservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@JmixEntity
@Table(name = "TRANSACTION_", indexes = {
        @Index(name = "IDX_TRANSACTION__FROM_ACC_ID", columnList = "FROM_ACC_ID_ID"),
        @Index(name = "IDX_TRANSACTION__TO_ACC_ID", columnList = "TO_ACC_ID_ID")
})
@Entity(name = "Transaction_")
public class Transaction {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private Integer id;

    @JoinColumn(name = "FROM_ACC_ID_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private BankAccount from_acc_id;

    @JoinColumn(name = "TO_ACC_ID_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BankAccount to_acc_id;

    @Column(name = "CREATE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date create_date;

    @Column(name = "TRANSFER_AMOUNT", precision = 19, scale = 2)
    private BigDecimal transfer_amount;
    @JoinTable(name = "TRANS_TO_TYPE_TRANSACTION_LINK",
            joinColumns = @JoinColumn(name = "TRANSACTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "TRANSACTION_TO_TYPE_ID"))
    @ManyToMany
    private List<TransactionToType> transactionToTypes;

    public List<TransactionToType> getTransactionToTypes() {
        return transactionToTypes;
    }

    public void setTransactionToTypes(List<TransactionToType> transactionToTypes) {
        this.transactionToTypes = transactionToTypes;
    }

    public BigDecimal getTransfer_amount() {
        return transfer_amount;
    }

    public void setTransfer_amount(BigDecimal transfer_amount) {
        this.transfer_amount = transfer_amount;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public BankAccount getTo_acc_id() {
        return to_acc_id;
    }

    public void setTo_acc_id(BankAccount to_acc_id) {
        this.to_acc_id = to_acc_id;
    }

    public BankAccount getFrom_acc_id() {
        return from_acc_id;
    }

    public void setFrom_acc_id(BankAccount from_acc_id) {
        this.from_acc_id = from_acc_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}