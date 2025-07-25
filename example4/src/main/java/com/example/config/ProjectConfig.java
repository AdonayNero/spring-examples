package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configurable
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean(name = "nissanVehicle") //con esto se convierte en un bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Nissan Rogue");
        return veh;
    }
    /*
 The method names usually follow verbs notation.But for methods
 which we will use to create beans, can use nouns as names.
 This will be a good practise as the method names will become
 bean names as well in the context.
 * */
    @Primary
    @Bean(value = "hondaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda Civic");
        return veh;
    }


    @Bean("suzukiVehicle") //con esto se convierte en un bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Suzuki jimny");
        return veh;
    }


}
