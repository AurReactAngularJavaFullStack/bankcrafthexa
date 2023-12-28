# language: fr
Fonctionnalité: Tests d'Intégration

  Scénario: Intégration des systèmes de paiement
    Étant donné que le système de paiement est configuré pour traiter les transactions
    Quand une demande de paiement est soumise
    Alors elle est traitée à travers l'intégration du système de paiement
    Et le résultat du paiement est enregistré dans le système de CraftHexBank
