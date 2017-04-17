package org.demoSpring;

public class SpringDemo {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	
	//constructors 
	public SpringDemo(String name){
		
		this.name = name;
	}
	
	public SpringDemo(int age){
		
		this.age = age;
	}
	
	
	public SpringDemo(String name,int age){
		this.name= name;
		this.age = age;
	}
	
	

	public void method(){
		
		System.out.println("Hello My name is::"+getName()+"\n" +"Age is::"+getAge());
	}

}
