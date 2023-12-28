# language: fr
Fonctionnalité: Interactions avec la Base de Données

  Scénario: Persistance des informations de transaction
    Étant donné que la transaction est approuvée pour l'utilisateur "Jean Dupont"
    Quand la transaction est traitée par le système
    Alors les détails de la transaction sont sauvegardés dans la base de données
