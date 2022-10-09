package com.company.bankservice.screen.transaction;

import io.jmix.ui.screen.*;
import com.company.bankservice.entity.Transaction;

import java.time.LocalDate;
import java.util.Date;

@UiController("Transaction_.edit")
@UiDescriptor("transaction-edit1.xml")
@EditedEntityContainer("transactionDc")
public class TransactionEdit extends StandardEditor<Transaction> {

    @Subscribe
    public void onInitEntity(InitEntityEvent<Transaction> event) {
        event.getEntity().setCreate_date(new Date());
    }


}