# language: fr
Fonctionnalité: Gestion de la Fraude

  Scénario: Détection de transactions frauduleuses
    Étant donné que le système de surveillance de la fraude est activé
    Quand une transaction suspecte est détectée sur le compte de Jean
    Alors la transaction est gelée
    Et une alerte est envoyée à l'équipe de sécurité de la banque

  Scénario: Vérification des activités suspectes avec le client
    Étant donné une transaction suspecte sur le compte de Jean
    Quand l'équipe de sécurité contacte Jean pour vérification
    Alors Jean confirme que la transaction est frauduleuse
    Et l'équipe de sécurité prend les mesures nécessaires
