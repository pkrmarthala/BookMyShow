package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public enum PaymentMode {
    UPI,
    CREDIT_CARD,
    DEBIT_CARD
    // CASH will not be supported in an online application
}
