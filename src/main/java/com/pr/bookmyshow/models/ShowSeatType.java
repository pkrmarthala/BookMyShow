package com.pr.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel {
    private Show show;
    private SeatType seatType;
    private int price;
}


// This class exists to calculate the prices of the tickets depending on the Seat types.
// Price depends on the Show + SeatTypes

// 5 PM Gold
// 11 PM Gold
// will have different prices