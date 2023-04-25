package DependancyInjection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user3.xml");
		User user = applicationContext.getBean("user",User.class);
		System.out.println(user);
		System.out.println(user.getEmail());
	}
}
