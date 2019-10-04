package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("movie")
public class Movie {
    @Autowired
//  [Autowire before setter is Autowire byName]
    private Actor hr;

    /*
    @Autowired
    [Autowire before setter is Autowire byType]
    public void setHr(Actor hr) {
        this.hr = hr;
    }*/

    public void disp(){
        System.out.println(hr);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "hr=" + hr +
                '}';
    }
}
