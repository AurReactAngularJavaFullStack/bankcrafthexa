package com.crafthexbank.bdd.steps.ui;

import com.crafthexbank.ui.UiController;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class UISteps {

    private UiController uiController;

    public UISteps() {
        uiController = new UiController();
    }

    @Alors("l'interface utilisateur affiche le message {string}")
    public void lInterfaceUtilisateurAfficheLeMessage(String message) {
        assertEquals("Le message affiché doit correspondre", message, uiController.getDisplayedMessage());
    }
}
