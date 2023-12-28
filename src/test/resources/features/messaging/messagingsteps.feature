# language: fr
Fonctionnalité: Messaging Asynchrone

  Scénario: Réception d'un message de confirmation après ouverture de compte
    Étant donné que le client "Jean Dupont" a ouvert un nouveau compte
    Quand le service de messagerie traite l'événement d'ouverture de compte
    Alors un message de confirmation est envoyé à l'adresse email de Jean
