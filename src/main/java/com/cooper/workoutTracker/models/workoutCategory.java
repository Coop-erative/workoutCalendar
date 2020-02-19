package com.cooper.workoutTracker.models;

public class workoutCategory {
    //Variables
    private String category;
    private int duration;
    private int priority;

    //Initialize
    public workoutCategory(String aCategory, int aDuration, int aPriority ) {
        category = aCategory;
        duration = aDuration;
        priority = aPriority;
    }

    //Custom methods = toString, hashCode, equals..
    @Override
    public String toString() {
        //TODO: figure toString validation and preferred return
//        String output = "";
//
//        output = String.format("");
//        return output;
    }
    //TODO: hashcode and equals...

    //Getters and Setter
    //TODO: once you complete variable check generate getters and setters
}
