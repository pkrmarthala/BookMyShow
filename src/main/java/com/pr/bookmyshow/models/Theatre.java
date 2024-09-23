package com.pr.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;
    // private List<Screen> screens;
    // User will not have any option to select screens. Screen is automatically selected based on the show.
    // Admin must have informed this. So, no use for this.

    private Region region;
}


/* Region : Theatre
 * 1 : M Cardinality
 * We will be storing region_id in the Theatre table
 * A simple query below will give the list of all theatres in a particular region.
 * SELECT * FROM Theatres WHERE region_id = 5;
 *
 * We can have a method findTheatresByRegion(Region) in the Theatre class
 */