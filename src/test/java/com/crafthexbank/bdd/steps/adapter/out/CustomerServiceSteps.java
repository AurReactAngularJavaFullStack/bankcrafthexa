package com.crafthexbank.bdd.steps.adapter.out;

import io.cucumber.java.fr.Étantdonné;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.crafthexbank.service.CustomerService;

public class CustomerServiceSteps {

    private CustomerService customerService;
    private String ticketId;
    private String clientId; // Vous pouvez ajouter cette variable d'état si nécessaire pour stocker clientId.
    private String demandeService; // Et une pour demandeService.

    public CustomerServiceSteps() {
        this.customerService = new CustomerService();
    }

    @Étantdonné("que le client {string} a soumis une demande de service concernant son compte")
    public void leClientASoumisUneDemandeDeService(String clientId) {
        this.clientId = clientId; // Stocker clientId pour une utilisation ultérieure.
        // Vous pouvez initialiser la logique de soumission ici si nécessaire.
    }

    @Quand("le service client reçoit la demande {string}")
    public void leServiceClientRecoitLaDemande(String demandeService) {
        this.demandeService = demandeService; // Stocker demandeService pour une utilisation ultérieure.
        this.ticketId = customerService.enregistrerDemande(this.clientId, demandeService);
    }

    @Alors("la demande est enregistrée avec un numéro de ticket unique")
    public void laDemandeEstEnregistreeAvecUnNumeroDeTicketUnique() {
        assertNotNull("Un numéro de ticket doit être généré", this.ticketId);
    }

    @Alors("une réponse automatique avec le numéro de ticket est envoyée à {string}")
    public void uneReponseAutomatiqueEstEnvoyee(String emailClient) {
        assertTrue("Une réponse doit être envoyée au client",
                customerService.verifierEnvoiReponse(emailClient, this.ticketId));
    }
}
