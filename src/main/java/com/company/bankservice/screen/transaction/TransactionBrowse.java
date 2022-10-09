package com.company.bankservice.screen.transaction;

import io.jmix.ui.screen.*;
import com.company.bankservice.entity.Transaction;

@UiController("Transaction_.browse")
@UiDescriptor("transaction-browse1.xml")
@LookupComponent("transactionsTable")
public class TransactionBrowse extends StandardLookup<Transaction> {
}