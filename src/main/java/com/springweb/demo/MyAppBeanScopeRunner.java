package com.springweb.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppBeanScopeRunner {

	public static void main(String[] args) {

		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:beanScope-applicationContext.xml");

		// retrieve bean form spring container
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// retrieve one more bean so that we can compare their reference
		Coach betaCoach = context.getBean("myCoach", Coach.class);

		// compare whether both are same singleton or not
		System.out.println("\nare both object same ? "+ (alphaCoach == betaCoach));

		// print the memory location for both object
		System.out.println("\nmemory location of alpha : "+ alphaCoach);
		System.out.println(("\nmemory location of beta : "+ betaCoach +"\n"));


		// close the context
		context.close();
	}

}
