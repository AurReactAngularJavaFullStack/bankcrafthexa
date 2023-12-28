package com.crafthexbank.bdd.steps.database;

import com.crafthexbank.database.DatabaseManager;
import com.crafthexbank.domain.Transaction;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;


import static org.junit.Assert.*;

public class DatabaseSteps {

    private DatabaseManager dbManager;
    private Transaction transaction;

    @Quand("la transaction est traitée par le système")
    public void traitementTransaction() {
        transaction = new Transaction(); // Transaction devrait être un objet métier approprié.
        dbManager = new DatabaseManager();
        transaction = dbManager.enregistrerTransaction(transaction);
    }

    @Alors("les détails de la transaction sont sauvegardés dans la base de données")
    public void sauvegardeDetailsTransaction() {
        boolean estEnregistree = dbManager.estTransactionEnregistree(transaction);
        assertTrue("La transaction doit être sauvegardée dans la base de données", estEnregistree);
    }
}