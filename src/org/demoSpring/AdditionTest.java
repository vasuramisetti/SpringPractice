package org.demoSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class AdditionTest {

	public static void main(String[] args) {
		//Triangle t1 = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Addition a1 = (Addition) context.getBean("addition");
	a1.method();
	}

}
