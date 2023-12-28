# language: fr
Fonctionnalité: Interactions Multidevises

  Scénario: Gestion de comptes en différentes devises
    Étant donné que Jean a des comptes en euros et en dollars
    Quand il consulte ses comptes sur l'application CraftHexBank
    Alors il voit les soldes dans les devises correspondantes

  Scénario: Paiements internationaux
    Étant donné que Jean doit effectuer un paiement international
    Quand il réalise un transfert en devise étrangère
    Alors le paiement est effectué au taux de change actuel avec les frais clairement indiqués
