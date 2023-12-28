# language: fr
Fonctionnalité: Assistance Automatisée et Chatbot

  Scénario: Interaction avec le chatbot pour une question simple
    Étant donné que Jean a une question sur les frais de transaction
    Quand il pose la question au chatbot de CraftHexBank
    Alors le chatbot fournit une réponse claire et pertinente

  Scénario: Escalade vers un conseiller humain depuis le chatbot
    Étant donné que Jean ne trouve pas de réponse à sa question complexe via le chatbot
    Quand il demande à parler à un conseiller humain
    Alors le chatbot transfère la demande à un membre de l'équipe de support client
