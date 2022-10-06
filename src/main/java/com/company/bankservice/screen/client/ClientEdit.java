package com.company.bankservice.screen.client;

import com.company.bankservice.entity.Client;
import io.jmix.ui.screen.*;

@UiController("Client.edit")
@UiDescriptor("client-edit1.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}