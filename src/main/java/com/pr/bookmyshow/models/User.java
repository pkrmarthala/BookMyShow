package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class User extends BaseModel {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private List<Booking> bookings;

}
