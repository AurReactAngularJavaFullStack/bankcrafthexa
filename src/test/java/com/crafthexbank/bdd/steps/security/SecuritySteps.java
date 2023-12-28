package com.crafthexbank.bdd.steps.security;

import com.crafthexbank.security.SecurityService;
import io.cucumber.java.fr.Quand;
import static org.junit.Assert.*;

public class SecuritySteps {

    private SecurityService securityService;

    public SecuritySteps() {
        securityService = new SecurityService();
    }

    @Quand("le système effectue une vérification de sécurité pour l'utilisateur {string}")
    public void leSystemeEffectueUneVerificationDeSecurite(String username) {
        assertTrue("La vérification de sécurité doit passer", securityService.performSecurityCheck(username));
    }
}
