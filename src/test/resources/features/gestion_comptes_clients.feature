# language: fr
Fonctionnalité: Gestion des Comptes Clients

  Contexte:
    Étant donné que le client "Jean Dupont" est authentifié avec le compte "JD123"

  Scénario: Ouverture d'un compte avec une devise spécifique
    Quand Jean demande l'ouverture d'un nouveau compte courant en "USD"
    Alors un nouveau compte courant en "USD" est ouvert pour Jean
    Et un email de confirmation est envoyé à l'adresse "jean.dupont@email.com"

  Scénario: Clôture d'un compte avec découvert non autorisé
    Étant donné que Jean a un solde de -50 euros sur son compte courant "FR761234"
    Quand il demande la clôture de son compte courant "FR761234"
    Alors la clôture du compte est refusée
    Et un message expliquant que le compte ne peut être clôturé avec un découvert est affiché
