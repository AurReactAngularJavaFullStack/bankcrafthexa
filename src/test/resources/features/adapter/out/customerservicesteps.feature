# language: fr
Fonctionnalité: Service Client

  Scénario: Réponse à une demande de service client
    Étant donné que l'utilisateur "Jean Dupont" a soumis une demande de service concernant son compte
    Quand le service client reçoit la demande
    Alors la demande est enregistrée avec un numéro de ticket unique
    Et une réponse automatique avec le numéro de ticket est envoyée à Jean
