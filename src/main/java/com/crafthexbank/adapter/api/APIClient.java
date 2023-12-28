package com.crafthexbank.adapter.api;

import com.crafthexbank.domain.model.Compte;

public class APIClient {

    private String baseUrl;

    public APIClient() {
        // Dans une application réelle, vous pourriez passer l'URL de base ici.
        this.baseUrl = "https://api.crafthexbank.com"; // Exemple d'URL de base
    }

    public void initialiser() {
        // Configuration des détails de connexion API, tels que les en-têtes d'authentification.
    }

    public Compte creerCompte(String devise) {
        // Simuler la création d'un compte par un appel API.
        // L'ID de compte et le solde initial sont fictifs pour cet exemple.
        return new Compte("123456789", devise, 0.0);
    }
}
