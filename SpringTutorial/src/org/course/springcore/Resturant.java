package org.course.springcore;

public class Resturant {
	
	IHotDrink hotDrink;
	
	Resturant(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
		
	}
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
	
}
