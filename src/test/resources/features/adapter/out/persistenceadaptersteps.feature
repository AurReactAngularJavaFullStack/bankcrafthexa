# language: fr
Fonctionnalité: Adapter de Persistance

  Scénario: Sauvegarde d'une nouvelle entité de compte
    Étant donné que le compte de "Jean Dupont" a été créé avec succès
    Quand le système tente de sauvegarder le compte dans la base de données
    Alors le compte est persisté sans erreurs
    Et un identifiant unique de compte est généré
