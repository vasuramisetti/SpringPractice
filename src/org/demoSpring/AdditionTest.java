package org.demoSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class AdditionTest {

	public static void main(String[] args) {
		//Triangle t1 = new Triangle();
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	Addition a1 = (Addition) factory.getBean("addition");
	a1.method();
	}

}
