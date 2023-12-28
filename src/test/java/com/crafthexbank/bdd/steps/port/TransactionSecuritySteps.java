package com.crafthexbank.bdd.steps.port;

import com.crafthexbank.domain.Transaction;
import com.crafthexbank.security.TransactionSecurityService;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class TransactionSecuritySteps {

    private TransactionSecurityService transactionSecurityService;
    private Transaction transaction;
    private boolean sécuritéValidée;

    @Quand("une transaction de {double} euros est initiée par {string}")
    public void uneTransactionEstInitiée(Double montant, String clientId) {
        transactionSecurityService = new TransactionSecurityService();
        transaction = new Transaction(clientId, montant);
    }

    @Alors("la transaction est vérifiée pour détecter toute fraude potentielle")
    public void laTransactionEstVérifiéePourDétecterTouteFraudePotentielle() {
        sécuritéValidée = transactionSecurityService.vérifierTransaction(transaction);
        assertTrue("La sécurité de la transaction doit être validée",
                sécuritéValidée);
    }
}