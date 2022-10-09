package com.company.bankservice.screen.transactiontotype;

import com.company.bankservice.entity.TransactionToType;
import io.jmix.ui.screen.*;

@UiController("TransactionToType.browse")
@UiDescriptor("transaction-to-type-browse1.xml")
@LookupComponent("transactionToTypesTable")
public class TransactionToTypeBrowse extends StandardLookup<TransactionToType> {
}