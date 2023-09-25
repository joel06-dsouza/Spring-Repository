package in.mindcraft.SpringDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Laptop l1 = (Laptop) context.getBean("l1");
		l1.show1();
		
		Laptop l2 = (Laptop) context.getBean("l2");
		l2.show2();

	}

}
