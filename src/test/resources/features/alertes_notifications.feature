# language: fr
Fonctionnalité: Alertes et Notifications

  Scénario: Réception d'une alerte de solde bas
    Étant donné que le solde du compte courant de Jean est inférieur au seuil minimum fixé
    Quand le système détecte le solde bas
    Alors Jean reçoit une notification par email et sur l'application mobile

  Scénario: Notification de virement reçu
    Étant donné que Jean attend un virement important
    Quand le virement est crédité sur son compte
    Alors Jean reçoit une notification l'informant de la réception du virement
