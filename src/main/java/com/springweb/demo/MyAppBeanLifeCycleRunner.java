package com.springweb.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppBeanLifeCycleRunner {

	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:beanLifeCycle-applicationContext.xml");

		// retrieve bean form spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);

		// call methods
		System.out.println(myCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}
