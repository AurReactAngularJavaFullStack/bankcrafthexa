# language: fr
Fonctionnalité: Notifications Réglementaires

  Scénario: Réception d'une notification de mise à jour des termes et conditions
    Étant donné que Jean utilise l'application CraftHexBank
    Quand une mise à jour des termes et conditions est publiée
    Alors Jean reçoit une notification lui demandant de revoir et d'accepter les nouvelles conditions

  Scénario: Information sur la protection des données personnelles
    Étant donné que Jean accède à l'application après une mise à jour réglementaire
    Quand il se connecte pour la première fois après la mise à jour
    Alors il reçoit des informations sur la nouvelle politique de protection des données
    Et doit donner son consentement pour continuer à utiliser l'application
