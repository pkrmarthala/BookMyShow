package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    private Movie movie;
    private Date startTime;
    private int duration;
    private Screen screen;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
