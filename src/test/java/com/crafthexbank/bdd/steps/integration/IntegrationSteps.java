package com.crafthexbank.bdd.steps.integration;

import com.crafthexbank.integration.IntegrationService;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class IntegrationSteps {

    private IntegrationService integrationService;
    private boolean intégrationRéussie;

    @Quand("les systèmes de paiement et de comptabilité sont intégrés")
    public void lesSystèmesDePaiementEtDeComptabilitéSontIntégrés() {
        integrationService = new IntegrationService();
        intégrationRéussie = integrationService.integrerPaiementEtComptabilité();
    }

    @Alors("les transactions financières sont synchronisées")
    public void lesTransactionsFinancièresSontSynchronisées() {
        assertTrue("Les transactions doivent être synchronisées entre les systèmes",
                intégrationRéussie);
    }
}
