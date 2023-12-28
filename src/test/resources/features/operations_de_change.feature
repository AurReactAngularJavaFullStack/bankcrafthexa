# language: fr
Fonctionnalité: Opérations de Change

  Scénario: Conversion de devise en ligne
    Étant donné que Jean souhaite convertir 1000 euros en dollars américains
    Quand il réalise l'opération de change via l'application bancaire
    Alors le montant est converti au taux de change actuel
    Et le montant en dollars est crédité sur son compte en USD

  Scénario: Alerte sur le taux de change
    Étant donné que Jean a activé les alertes pour le taux de change EUR/USD
    Quand le taux atteint un niveau qu'il a spécifié
    Alors il reçoit une notification l'informant du taux favorable
