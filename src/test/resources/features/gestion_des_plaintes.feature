# language: fr
Fonctionnalité: Gestion des Plaintes

  Scénario: Soumettre une plainte via l'application
    Étant donné que Jean a un problème avec une transaction récente
    Quand il soumet une plainte via l'application CraftHexBank
    Alors la plainte est enregistrée
    Et un numéro de suivi est fourni à Jean

  Scénario: Suivi d'une plainte existante
    Étant donné que Jean a déposé une plainte il y a une semaine
    Quand il vérifie l'état de sa plainte via l'application
    Alors il voit une mise à jour sur le traitement de sa plainte
