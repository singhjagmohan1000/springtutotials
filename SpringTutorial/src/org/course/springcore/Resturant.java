package org.course.springcore;

public class Resturant {
	
	IHotDrink hotDrink;
	/**
	 * Constructor Style DI
	 * @param hotDrink
	 */
//	Resturant(IHotDrink hotDrink){
//		this.hotDrink = hotDrink;
//		
//	}
	public void setHotDrink(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
	
}
