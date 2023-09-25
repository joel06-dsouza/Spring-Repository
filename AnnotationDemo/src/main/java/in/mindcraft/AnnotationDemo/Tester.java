package in.mindcraft.AnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Mobile m1 = (Mobile) context.getBean("mobile");
		m1.show();
		Mobile m2 = (Mobile) context.getBean("mobile");
		m2.show();
	}

}
