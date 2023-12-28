package com.crafthexbank.bdd.steps.domain;

import com.crafthexbank.domain.service.RiskAssessmentService;
import io.cucumber.java.fr.Étantdonné;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class DomainSteps {

    private RiskAssessmentService riskAssessmentService;
    private boolean risqueÉlevé;

    @Étantdonné("que le profil de risque du client {string} est évalué")
    public void queLeProfilDeRisqueDuClientEstÉvalué(String clientId) {
        riskAssessmentService = new RiskAssessmentService();
        risqueÉlevé = riskAssessmentService.evaluerRisqueClient(clientId);
    }

    @Alors("un avertissement est généré si le risque est élevé")
    public void unAvertissementEstGénéréSiLeRisqueEstÉlevé() {
        assertTrue("Un avertissement doit être généré en cas de risque élevé",
                risqueÉlevé);
    }
}
