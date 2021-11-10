package com.springweb.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppUsingSetterInjection {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call the method on bean
        System.out.println("Routine : "+myCoach.getDailyWorkout());

        // let's call our new method for getFortune
        System.out.println("Fortune : "+myCoach.getFortune());

        // let's print literals
        System.out.println("Email : "+myCoach.getEmail());
        System.out.println("Team Name : "+myCoach.getTeamName());

        // close the context
        context.close();

    }
}
