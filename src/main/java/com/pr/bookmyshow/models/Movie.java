package com.pr.bookmyshow.models;

import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;
    private String genre;
    private List<String> actors; // we can have a separate Actor class for extensibility

    @ManyToMany
    private List<Language> languages;
}
