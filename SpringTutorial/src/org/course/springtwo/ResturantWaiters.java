package org.course.springtwo;

import java.util.List;

public class ResturantWaiters {
	
	List resturantWaiters;

	
	public void setResturantWaiters(List resturantWaiters) {
		this.resturantWaiters = resturantWaiters;
	}
	
	public void displayWaiters(){
		System.out.println("Waiters are: "+ resturantWaiters);
	}
	

}
