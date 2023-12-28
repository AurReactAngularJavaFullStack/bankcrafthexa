package com.crafthexbank.bdd.steps.adapter.out;

import com.crafthexbank.adapter.persistence.PersistenceAdapter;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class PersistenceAdapterSteps {

    private PersistenceAdapter persistenceAdapter;
    private Object entity;

    public PersistenceAdapterSteps() {
        persistenceAdapter = new PersistenceAdapter();
    }

    @Alors("l'entité est persistée dans la base de données")
    public void lEntiteEstPersisteeDansLaBaseDeDonnees() {
        assertTrue("L'entité doit être persistée", persistenceAdapter.persist(entity));
    }
}