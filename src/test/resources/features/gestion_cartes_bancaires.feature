# language: fr
Fonctionnalité: Gestion des Cartes Bancaires

  Scénario: Blocage d'une carte bancaire perdue
    Étant donné que Jean a égaré sa carte bancaire
    Quand il signale la perte via l'application bancaire
    Alors la carte est immédiatement bloquée pour prévenir une utilisation frauduleuse

  Scénario: Demande de nouvelle carte
    Étant donné que la carte de Jean a été bloquée à cause de la perte
    Quand il demande une nouvelle carte via l'application
    Alors une nouvelle carte est émise
    Et elle est envoyée à son adresse postale enregistrée
