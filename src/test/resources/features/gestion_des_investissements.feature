# language: fr
Fonctionnalité: Gestion des Investissements

  Scénario: Achat d'actions via l'application
    Étant donné que Jean souhaite investir dans des actions Apple
    Quand il achète des actions via l'application bancaire
    Alors les actions sont ajoutées à son portefeuille d'investissement

  Scénario: Vente d'actions avec alerte de profit
    Étant donné que Jean détient des actions Google
    Quand la valeur des actions augmente de 20% par rapport à son prix d'achat
    Alors il reçoit une alerte lui suggérant de vendre ses actions
