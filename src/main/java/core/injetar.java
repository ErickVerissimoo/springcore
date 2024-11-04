package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class injetar {
	

public static void main(String[] args) {
	ApplicationContext context = new  ClassPathXmlApplicationContext("spring-config.xml");
	pessoa in = (pessoa) context.getBean(pessoa.class);
	
	
	System.out.print(in.getMeucar().nome);
	

}
}
