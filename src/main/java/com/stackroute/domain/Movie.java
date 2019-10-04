package com.stackroute.domain;

import org.springframework.stereotype.Component;

//@Component("movie")
public class Movie {
    private Actor hr;

    public void setHr(Actor hr) {
        this.hr = hr;
    }

/*
      public Movie(Actor actor) {
        this.actor = actor;
     }*/

    public void disp(){
        System.out.println("Name: "+hr.getName()+" Age: "+hr.getAge()+" Gender: "+hr.getGender());
    }
}
