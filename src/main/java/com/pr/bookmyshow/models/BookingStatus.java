package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public enum BookingStatus {
    SUCCESSFUL,
    CANCELLED,
    PENDING,
    FAILED
}
