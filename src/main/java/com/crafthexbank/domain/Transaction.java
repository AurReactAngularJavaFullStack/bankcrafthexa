package com.crafthexbank.domain;

public class Transaction {

    private String id;
    private double montant;
    private String type; // par exemple, "DEPOT", "RETRAIT", etc.
    public Transaction(String id, double montant) {
        this.id = id;
        this.montant = montant;
    }

    public Transaction() {
        // Génération d'un ID de transaction fictif pour l'exemple
        this.id = "TXN" + System.currentTimeMillis();
        // Initialiser d'autres attributs si nécessaire
    }


    // Getters et setters pour les attributs de la transaction
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // D'autres méthodes métier peuvent être ajoutées ici
}
