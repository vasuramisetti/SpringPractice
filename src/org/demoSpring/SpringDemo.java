package org.demoSpring;

import java.util.List;

public class SpringDemo {
	
	private List<Point> points; 

	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void method(){
	for(Point  point :points){	
	System.out.println("Points =("+point.getX()+ "," +point.getY() +")");
	}
	}

}
