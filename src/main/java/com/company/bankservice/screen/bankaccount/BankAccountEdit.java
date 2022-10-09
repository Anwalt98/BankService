package com.company.bankservice.screen.bankaccount;

import com.company.bankservice.app.BankAccountService;
import io.jmix.ui.screen.*;
import com.company.bankservice.entity.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("BankAccount.edit")
@UiDescriptor("bank-account-edit1.xml")
@EditedEntityContainer("bankAccountDc")
public class BankAccountEdit extends StandardEditor<BankAccount> {

    @Autowired
    private BankAccountService bankAccountService;


//    @Subscribe
//    public void onInitEntity(InitEntityEvent<BankAccount> event) {
//      event.getEntity().setId(bankAccountService.findBankAccountByUserId(event.getEntity().getUser_id()).stream().findFirst().get().getId());
//  }
    
}