package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class injetar {

public static void main(String[] args) {
	ApplicationContext context = new  ClassPathXmlApplicationContext("spring-config.xml");
	ApplicationContext secondContext = new AnnotationConfigApplicationContext(factory.class);
	
	System.out.println(secondContext.containsBean("corola"));
	
	

}
}
