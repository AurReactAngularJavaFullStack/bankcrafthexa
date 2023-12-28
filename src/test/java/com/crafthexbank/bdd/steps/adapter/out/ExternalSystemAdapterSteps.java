package com.crafthexbank.bdd.steps.adapter.out;

import com.crafthexbank.external.CreditResponse;
import com.crafthexbank.external.ExternalCreditSystem;
import com.crafthexbank.external.ExternalSystem;
import io.cucumber.java.fr.Étantdonné;
import io.cucumber.java.fr.Alors;

import static org.junit.Assert.assertTrue;

public class ExternalSystemAdapterSteps {

    private ExternalSystem externalSystem;

    @Étantdonné("que le système externe de crédit est configuré")
    public void leSystemeExterneDeCreditEstConfigure() {
        externalSystem = new ExternalCreditSystem();
        externalSystem.configurer();
    }

    @Alors("une réponse positive du système de crédit est reçue pour le client {string}")
    public void uneReponsePositiveEstRecue(String clientId) {
        CreditResponse response = externalSystem.verifierCredit(clientId);
        assertTrue("Le client doit être éligible au crédit", response.estEligible());
    }
}
