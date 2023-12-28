package com.crafthexbank.bdd.steps.api;

import com.crafthexbank.adapter.api.APIClient;
import com.crafthexbank.domain.model.Compte;
import io.cucumber.java.fr.Étantdonné;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class APISteps {

    private APIClient apiClient;
    private Compte compte;

    @Étantdonné("que l'API de CraftHexBank est prête à recevoir des requêtes")
    public void apiPrête() {
        apiClient = new APIClient();
        apiClient.initialiser();
    }

    @Alors("un nouveau compte en {string} est créé pour le client")
    public void creationComptePourClient(String devise) {
        compte = apiClient.creerCompte(devise);
        assertNotNull("Le compte doit être créé", compte);
        assertEquals("La devise du nouveau compte doit correspondre à la devise demandée", devise, compte.getDevise());
    }

    private void assertNotNull(String leCompteDoitÊtreCréé, Compte compte) {

    }
}
