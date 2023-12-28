# language: fr

Fonctionnalité: Gestion avancée des comptes clients
  En tant que client de la banque CraftHexBank
  Je souhaite pouvoir effectuer des opérations avancées sur mes comptes
  Afin de répondre à mes besoins financiers spécifiques

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

  Scénario: Demande d'augmentation de découvert autorisé
    Étant donné que Jean a un découvert autorisé de 100 euros sur son compte courant "FR761234"
    Quand il demande une augmentation de découvert à 200 euros
    Alors sa demande est enregistrée et transmise au service client pour approbation

Fonctionnalité: Transactions financières sécurisées
  En tant que client de la banque CraftHexBank
  Je souhaite que mes transactions soient sécurisées et vérifiables
  Afin de prévenir la fraude et les erreurs

  Scénario: Transfert sécurisé vers un nouveau bénéficiaire
    Étant donné que Jean a un compte courant "FR761234"
    Et qu'il n'a jamais effectué de transfert vers le compte "DE893704"
    Quand il configure un nouveau bénéficiaire avec le compte "DE893704"
    Et qu'il valide le transfert de 200 euros vers ce bénéficiaire via une authentification à deux facteurs
    Alors le bénéficiaire "DE893704" est ajouté
    Et le transfert de 200 euros est effectué avec succès

  Scénario: Alerte de transaction inhabituelle
    Étant donné que Jean a un historique de transactions habituelles inférieures à 1000 euros
    Quand une transaction de 5000 euros est initiée depuis son compte
    Alors une alerte de sécurité est déclenchée
    Et Jean reçoit une notification par SMS pour vérifier cette transaction

Fonctionnalité: Gestion personnalisée de la clientèle
  En tant que conseiller clientèle de CraftHexBank
  Je souhaite pouvoir offrir des services personnalisés à mes clients
  Afin de renforcer la fidélité des clients et de répondre à leurs attentes individuelles

  Scénario: Attribution de conseiller personnel
    Étant donné que Jean est identifié comme un client "Premium"
    Quand il accède à son espace client en ligne
    Alors il voit le nom et le contact de son conseiller personnel

  Scénario: Offre personnalisée de produit financier basée sur le profil du client
    Étant donné que Jean a un dépôt régulier important et un profil d'investisseur "modéré"
    Quand il se connecte à son espace client
    Alors il reçoit une offre personnalisée pour un fonds d'investissement correspondant à son profil de risque

