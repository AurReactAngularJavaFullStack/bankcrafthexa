package com.crafthexbank.bdd.steps.messaging;

import com.crafthexbank.messaging.MessagingService;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;

import static org.junit.Assert.assertTrue;

public class MessagingSteps {

    private MessagingService messagingService;
    private String compteId; // Ajout de la déclaration de la variable compteId

    public MessagingSteps() {
        messagingService = new MessagingService();
        // Initialiser compteId avec une valeur appropriée, par exemple, un ID fictif
        compteId = "12345";
    }

    @Quand("une notification de confirmation est envoyée après ouverture de compte")
    public void uneNotificationDeConfirmationEstEnvoyee() {
        messagingService.envoyerNotificationConfirmation(compteId);
    }

    @Alors("le client {string} reçoit la notification par email")
    public void leClientRecoitLaNotificationParEmail(String emailClient) {
        assertTrue("Le client doit recevoir la notification de confirmation",
                messagingService.estNotificationEnvoyee(emailClient, compteId));
    }
}
