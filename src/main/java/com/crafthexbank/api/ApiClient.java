package com.crafthexbank.api;

public class ApiClient {

    private int lastResponseStatus;

    public ApiClient() {
        // Constructeur pour initialiser le client API.
        // Vous pouvez ici initialiser des détails tels que les URL de base, les en-têtes, etc.
    }

    // Méthode pour faire un appel API (exemple fictif).
    public void faireAppelApi(String endpoint) {
        // Simuler un appel API. Dans une application réelle, vous feriez ici un appel réseau.
        // Par exemple, utiliser HttpClient pour faire un appel GET ou POST.

        // Simuler un statut de réponse. Dans une application réelle, cela proviendrait de la réponse HTTP.
        this.lastResponseStatus = 200; // Supposons que le statut de la réponse est OK (200).
    }

    // Méthode pour obtenir le dernier statut de réponse de l'API.
    public int getLastResponseStatus() {
        return lastResponseStatus;
    }

    // Vous pouvez ajouter d'autres méthodes pour gérer différents types d'appels API, gérer les réponses, etc.
}
