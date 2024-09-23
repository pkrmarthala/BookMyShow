package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity // comes from the JPA
public class Booking extends BaseModel {
    // Booking 1 : M ShowSeats (max 10)
    @OneToMany
    private List<ShowSeat> showSeats; // bookedSeats;
    private int amount;

    // Booking M : 1 User
    @ManyToOne
    private User bookedBy;

    // Booking M : 1 Show
    @ManyToOne
    private Show currentShow;
    private Date bookingDate;

    // Booking 1 : M Payments
    @OneToMany
    private List<Payment> payments;

    @ManyToOne
    private BookingStatus bookingStatus;
}
