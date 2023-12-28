# language: fr
Fonctionnalité: Gestion de la Liquidité

  Scénario: Prévision de flux de trésorerie pour les entreprises
    Étant donné que Jean gère une entreprise cliente de CraftHexBank
    Quand il utilise l'outil de prévision de flux de trésorerie
    Alors il reçoit une estimation de la liquidité future de son entreprise

  Scénario: Alerte de fonds insuffisants
    Étant donné que le compte de Jean approche d'un solde négatif
    Quand le solde devient critique
    Alors Jean reçoit une alerte lui suggérant de transférer des fonds
