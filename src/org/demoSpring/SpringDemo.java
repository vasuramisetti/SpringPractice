package org.demoSpring;

public class SpringDemo {
	
	private String name;
	
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public SpringDemo(String name){
		
		this.name = name;
	}


	public void method(){
		
		System.out.println("Hello My name is:"+getName());
	}

}
