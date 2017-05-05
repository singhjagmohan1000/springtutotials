package org.course.springthree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringThree {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	ResturantFactory resturantFactory = (ResturantFactory)context.getBean("restBean");
	resturantFactory.greetCustomer();
	
}
}
