package com.crafthexbank.bdd.steps.domain;

import com.crafthexbank.domain.model.Compte;
import com.crafthexbank.domain.service.CompteService;
import io.cucumber.java.fr.Étantdonné;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class AccountManagementSteps {

    private CompteService compteService;
    private Compte compte;

    @Étantdonné("que le client {string} a un compte courant avec un solde de {double}")
    public void queLeClientAPourSolde(String clientId, Double solde) {
        compteService = new CompteService();
        compte = compteService.creerCompte(clientId, solde);
    }

    @Quand("il effectue un dépôt de {double} euros")
    public void ilEffectueUnDepot(Double montant) {
        compteService.deposer(compte, montant);
    }

    @Alors("le nouveau solde du compte est de {double} euros")
    public void leNouveauSoldeDuCompteEst(Double soldeAttendu) {
        assertEquals("Le solde du compte doit être mis à jour",
                soldeAttendu, compte.getSolde(), 0.001);
    }
}