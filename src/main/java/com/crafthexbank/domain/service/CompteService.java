package com.crafthexbank.domain.service;

import com.crafthexbank.domain.model.Compte;

public class CompteService {

    public CompteService() {
        // Initialisation du service, si nécessaire.
    }

    // Méthode pour créer un compte avec un solde initial.
    public Compte creerCompte(String clientId, double soldeInitial) {
        // Créer un nouveau compte avec le solde initial fourni.
        // Dans une application réelle, il pourrait y avoir une vérification d'existence du client,
        // ainsi que d'autres règles métier à appliquer.
        Compte nouveauCompte = new Compte(clientId, soldeInitial);
        // Ici, il faudrait persister le nouveau compte en utilisant un repository ou un DAO.
        return nouveauCompte;
    }

    // Méthode pour effectuer un dépôt sur un compte.
    public void deposer(Compte compte, double montant) {
        // Ajouter le montant au solde du compte.
        if(montant > 0) {
            compte.setSolde(compte.getSolde() + montant);
            // Ici, il faudrait mettre à jour le compte dans la base de données.
        }
        // Gérer le cas où le montant est invalide (par exemple, un montant négatif).
    }
}

