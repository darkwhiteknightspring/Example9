package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    public
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean(name="vehicle2")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
}
