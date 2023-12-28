package com.crafthexbank.bdd.steps.adapter.in;

import com.crafthexbank.bdd.steps.ui.Dashboard;
import com.crafthexbank.bdd.steps.ui.PageConnexion;
import io.cucumber.java.fr.Étantdonné;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Alors;
import static org.junit.Assert.*;

public class WebAdapterSteps {

    private PageConnexion pageConnexion;
    private Dashboard dashboard;

    @Étantdonné("que l'utilisateur {string} est sur la page de connexion")
    public void utilisateurSurPageDeConnexion(String username) {
        pageConnexion = new PageConnexion();
    }

    @Quand("il saisit son identifiant {string} et son mot de passe {string}")
    public void saisieIdentifiants(String username, String password) {
        pageConnexion.entrerIdentifiants(username, password);
    }

    @Alors("il est redirigé vers son tableau de bord personnel")
    public void redirectionVersTableauDeBord() {
        dashboard = pageConnexion.cliqueSurConnexion();
        assertNotNull("L'utilisateur doit être redirigé vers le tableau de bord", dashboard);
    }
}
