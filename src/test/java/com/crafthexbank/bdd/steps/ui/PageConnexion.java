package com.crafthexbank.bdd.steps.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageConnexion {

    private WebDriver driver;

    // Les localisateurs pour les éléments de la page de connexion
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("loginButton");

    public PageConnexion() {
        this.driver = driver;
    }

    public void entrerIdentifiants(String username, String password) {
        WebElement usernameField = driver.findElement(usernameLocator);
        WebElement passwordField = driver.findElement(passwordLocator);

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public Dashboard cliqueSurConnexion() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

        // Retourner une nouvelle page de tableau de bord après la connexion
        return new Dashboard(driver);
    }
}
