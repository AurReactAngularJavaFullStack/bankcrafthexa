package com.crafthexbank.bdd.steps.port;

import com.crafthexbank.api.ApiClient;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class ApiSteps {

    private ApiClient apiClient;

    public ApiSteps() {
        apiClient = new ApiClient();
    }

    @Alors("la réponse de l'API contient le statut {int}")
    public void laReponseDeLAPIContientLeStatut(int status) {
        assertEquals("Le statut de la réponse doit correspondre", status, apiClient.getLastResponseStatus());
    }
}
