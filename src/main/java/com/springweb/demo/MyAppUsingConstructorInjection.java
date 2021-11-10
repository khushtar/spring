package com.springweb.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppUsingConstructorInjection {

    public static void main(String[] args) {

        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:applicationContext.xml");

        // retrieve bean from spring container
        Coach myCoach = context.getBean("myCoach", Coach.class);

        // call the method on bean
        System.out.println(myCoach.getDailyWorkout());

        // let's call our new method for ge tFortune
        System.out.println(myCoach.getFortune());

        // close the context
        context.close();

    }

}
