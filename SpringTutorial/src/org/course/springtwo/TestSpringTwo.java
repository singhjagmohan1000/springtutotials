package org.course.springtwo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringTwo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		ResturantWaiters resturantObj = (ResturantWaiters) context.getBean("resturantWaiterBean");
		resturantObj.displayWaiters();
	}

}
