package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private int amount;
    private String referenceNumber;
    private Date paymentDate;

    @ManyToOne
    private PaymentMode paymentMode;

    private PaymentGateway paymentGateway;

    private PaymentStatus paymentStatus;

    @OneToOne
    private Booking booking;
}
