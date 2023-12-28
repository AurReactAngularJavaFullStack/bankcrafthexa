package com.crafthexbank.domain.model;

public class Compte {

    private String id;
    private String devise;
    private double solde;

    public Compte(String id, double solde) {
        this.id = id;
        this.solde = solde;
    }


    public Compte(String id, String devise, double solde) {
        this.id = id;
        this.devise = devise;
        this.solde = solde;
    }

    public String getId() {
        return id;
    }

    public String getDevise() {
        return devise;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
