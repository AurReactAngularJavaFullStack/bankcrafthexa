package com.crafthexbank.database;

import com.crafthexbank.domain.Transaction;

public class DatabaseManager {

    public DatabaseManager() {
        // Constructeur pour initialiser la connexion à la base de données ou d'autres ressources
    }

    public Transaction enregistrerTransaction(Transaction transaction) {
        // Logique pour enregistrer la transaction dans la base de données
        // Dans une application réelle, vous interagiriez avec la base de données ici

        // Pour l'exemple, nous allons simplement simuler que la transaction a été enregistrée avec succès
        return transaction; // Retourne la transaction avec l'ID affecté
    }

    public boolean estTransactionEnregistree(Transaction transaction) {
        // Logique pour vérifier si la transaction est enregistrée dans la base de données
        // Dans une application réelle, vous feriez une requête à la base de données ici

        // Pour l'exemple, nous allons simplement supposer que toutes les transactions sont enregistrées avec succès
        return transaction != null && transaction.getId() != null;
    }
}
