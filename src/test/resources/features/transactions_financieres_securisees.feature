# language: fr
Fonctionnalité: Transactions Financières Sécurisées

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
