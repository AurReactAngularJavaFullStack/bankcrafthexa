package com.crafthexbank.ui;

public class UiController {

    private String displayedMessage;

    public UiController() {
        // Initialisation du contrôleur UI.
    }

    // Méthode pour simuler l'affichage d'un message sur l'interface utilisateur.
    public void displayMessage(String message) {
        this.displayedMessage = message;
        // Dans une application réelle, cette méthode mettrait à jour l'interface utilisateur.
    }

    // Méthode pour obtenir le message actuellement affiché sur l'interface utilisateur.
    public String getDisplayedMessage() {
        return displayedMessage;
    }
}
