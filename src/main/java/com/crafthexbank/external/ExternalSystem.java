package com.crafthexbank.external;

public interface ExternalSystem {
    void configurer();
    CreditResponse verifierCredit(String clientId);
}
