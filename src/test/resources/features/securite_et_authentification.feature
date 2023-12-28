# language: fr
Fonctionnalité: Sécurité et Authentification

  Scénario: Connexion sécurisée avec authentification à deux facteurs
    Étant donné que Jean tente de se connecter à son compte
    Quand il saisit correctement son nom d'utilisateur et son mot de passe
    Alors une demande d'authentification à deux facteurs est envoyée à son téléphone

  Scénario: Réinitialisation sécurisée du mot de passe
    Étant donné que Jean a oublié son mot de passe
    Quand il demande une réinitialisation de mot de passe
    Alors il reçoit un email avec un lien sécurisé pour réinitialiser son mot de passe
