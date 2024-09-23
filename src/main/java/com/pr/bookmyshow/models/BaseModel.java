package com.pr.bookmyshow.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor

@MappedSuperclass // All the attributes of this class will be available as columns in child class tables
public class BaseModel {
    @Id
    private int id;
    private Date createdAt;
    private Date lastModifiedAt;
}

// All these models are in the app now (in-memory).
// Later, corresponding tables will be created which will persist the data

// The flow goes like:
// get the data from the client
// Do certain business logic: creating certain objects
// You may need to extract the data from DB and put it to the objects or get the object data and store it in the DB.
// Basically, we need to interact with the DB.

// ORM: Object Relation Mapping
// Hibernate is the most famous ORM for Spring Boot
// It writes certain functions / queries by itself so that you can just call those functions to get your work done.
// Focus on the implementation of certain methods which internally uses SQL queries & get your ORM work done

// Spring Data JPA (Java Processings API)

