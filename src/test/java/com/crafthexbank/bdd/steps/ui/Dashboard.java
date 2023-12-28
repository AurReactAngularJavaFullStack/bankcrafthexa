package com.crafthexbank.bdd.steps.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

    private WebDriver driver;

    // Supposons que vous ayez un message de bienvenue qui confirme que l'utilisateur est connecté
    private By welcomeMessageLocator = By.id("welcomeMessage");

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessageLocator).getText();
    }

    // Vous pouvez ajouter d'autres méthodes pour interagir avec le tableau de bord ici
}
