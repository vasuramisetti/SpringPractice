package org.demoSpring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringDemo implements ApplicationContextAware, BeanNameAware{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext Context = null;
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	
	public Point getPointB() {
		return pointB;
	}


	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	
	public Point getPointC() {
		return pointC;
	}


	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public void method(){
		
	System.out.println("Point A =("+getPointA().getX()+ "," +getPointA().getY() +")");
	System.out.println("Point B = ("+getPointB().getX()+ "," +getPointB().getY() +")");
	System.out.println("Point C = ("+getPointC().getX()+ "," +getPointC().getY()+ ")");
	}


	@Override
	public void setApplicationContext(ApplicationContext Context) 
	throws BeansException {
	this.Context= Context;
		
	}


	@Override
	public void setBeanName(String BeanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is ::"+BeanName);
	}
	
	

}
