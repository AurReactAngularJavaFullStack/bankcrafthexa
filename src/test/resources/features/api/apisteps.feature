# language: fr
Fonctionnalité: API de Gestion de Compte

  Scénario: Création d'un nouveau compte via l'API
    Étant donné que l'API de CraftHexBank est prête à recevoir des requêtes
    Quand un client envoie une demande de création de compte avec "USD" comme devise
    Alors un nouveau compte en "USD" est créé pour le client
    Et un identifiant de compte est renvoyé dans la réponse
