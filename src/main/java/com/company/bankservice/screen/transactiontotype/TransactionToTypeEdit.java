package com.company.bankservice.screen.transactiontotype;

import com.company.bankservice.entity.TransactionToType;
import io.jmix.ui.screen.*;

@UiController("TransactionToType.edit")
@UiDescriptor("transaction-to-type-edit1.xml")
@EditedEntityContainer("transactionToTypeDc")
public class TransactionToTypeEdit extends StandardEditor<TransactionToType> {
}