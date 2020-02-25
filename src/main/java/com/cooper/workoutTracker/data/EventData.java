package com.cooper.workoutTracker.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//This is a basic set up & needs to be updated for this project specifically
//TODO: update to this project.

@Entity
public class EventData {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name is required")
    @Size(min =3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    public EventData(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
