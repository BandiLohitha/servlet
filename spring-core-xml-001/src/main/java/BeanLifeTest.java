import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {

	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		BeanLife life=(BeanLife) ac.getBean("lie");
		System.out.println(life);
		
		AbstractApplicationContext aac=(AbstractApplicationContext) ac;
				aac.close();
	}
}
