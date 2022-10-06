package com.company.bankservice.screen.bankaccount;

import io.jmix.ui.screen.*;
import com.company.bankservice.entity.BankAccount;

@UiController("BankAccount.edit")
@UiDescriptor("bank-account-edit.xml")
@EditedEntityContainer("bankAccountDc")
public class BankAccountEdit extends StandardEditor<BankAccount> {
}