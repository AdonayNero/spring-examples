package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("nissanVehicle",Vehicle.class);
        System.out.println("Vehicle name from configured bean: " + veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from configured bean: " + veh2.getName());

        Vehicle veh3 = context.getBean("suzukiVehicle",Vehicle.class);
        System.out.println("Vehicle name from configured bean: " + veh3.getName());
    }
}


