package org.demoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoTest {

	public static void main(String[] args) {
		//Triangle t1 = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
	
		ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
		SpringDemo s1 = (SpringDemo) Context.getBean("SpringDemo2");
		s1.method();
	}

}
