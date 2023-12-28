package com.crafthexbank.bdd.steps.performance;

import com.crafthexbank.testing.PerformanceTester;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;

import static org.junit.Assert.assertTrue;

public class PerformanceSteps {

    private PerformanceTester performanceTester;

    @Quand("le système est soumis à un test de charge")
    public void leSystemeEstSoumisAUnTestDeCharge() {
        performanceTester = new PerformanceTester();
        performanceTester.démarrerTestDeCharge();
    }

    @Alors("le temps de réponse reste dans les limites acceptables")
    public void leTempsDeReponseResteDansLesLimitesAcceptables() {
        assertTrue("Le système doit répondre dans un temps acceptable",
                performanceTester.estTempsDeReponseAcceptable());
    }
}
