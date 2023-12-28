package com.crafthexbank.external;

public class CreditResponse {

    private final boolean estEligible;
    private final double montantCreditApprouve;

    public CreditResponse(boolean estEligible, double montantCreditApprouve) {
        this.estEligible = estEligible;
        this.montantCreditApprouve = montantCreditApprouve;
    }

    public boolean estEligible() {
        return estEligible;
    }

    public double getMontantCreditApprouve() {
        return montantCreditApprouve;
    }
}

