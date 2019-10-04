package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.lang.reflect.AccessibleObject;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class AppConfig {
   @Bean
    public Actor actor(){
        Actor hr = new Actor();
       hr.setName("Hrithik");
       hr.setGender("Male");
       hr.setAge(42);
        return hr;
    }
    /*
    @Bean
    @Scope("prototype")
    public Movie movie(){
        Movie movie = new Movie(actor());
        return movie;
    }
*/
}
