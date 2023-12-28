# language: fr
Fonctionnalité: Sécurité des Transactions

  Scénario: Vérification de la sécurité d'une transaction
    Étant donné que Jean Dupont initie un transfert de 10 000 euros
    Quand le système réalise des contrôles de sécurité
    Alors la transaction est marquée pour une vérification manuelle si elle semble suspecte
