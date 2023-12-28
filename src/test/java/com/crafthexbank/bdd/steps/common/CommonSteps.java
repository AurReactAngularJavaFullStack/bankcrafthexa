package com.crafthexbank.bdd.steps.common;

import com.crafthexbank.testing.ApplicationContext;
import io.cucumber.java.fr.Étantdonné;
import static org.junit.Assert.*;

public class CommonSteps {

    private ApplicationContext appContext;

    public CommonSteps() {
        appContext = new ApplicationContext();
    }

    @Étantdonné("que l'application est démarrée")
    public void queLApplicationEstDemarree() {
        assertTrue("L'application doit être démarrée", appContext.isInitialized());
    }
}
