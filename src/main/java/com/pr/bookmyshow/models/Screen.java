package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;


    private List<Seat> seats;

    @ManyToOne
    private Theatre theatre;
    private List<Feature> features;
}
