package com.crafthexbank.testing;

public class ApplicationContext {

    private boolean initialized = false;

    public ApplicationContext() {
        // Effectuer ici l'initialisation globale nécessaire pour le contexte de l'application
        // Par exemple, charger des configurations, initialiser des services, etc.
    }

    public boolean isInitialized() {
        // Cette méthode vérifierait si l'application a été correctement initialisée.
        // Pour les besoins du test, nous supposerons que cette méthode renvoie toujours true.
        return true;
    }

    // D'autres méthodes pour gérer l'état de l'application, obtenir des services, etc.
}
