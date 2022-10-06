package com.company.bankservice.screen.client;

import com.company.bankservice.entity.Client;
import io.jmix.ui.screen.*;

@UiController("Client.browse")
@UiDescriptor("client-browse1.xml")
@LookupComponent("clientsTable")
public class ClientBrowse extends StandardLookup<Client> {
}