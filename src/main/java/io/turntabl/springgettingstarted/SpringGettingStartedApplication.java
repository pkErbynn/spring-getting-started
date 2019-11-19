package io.turntabl.springgettingstarted;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGettingStartedApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		HumanBean person = (HumanBean)ac.getBean("humanBean");
		System.out.println(person.fname);
		System.out.println(person.lname);

		System.out.println("First Name; " + person.bestFriend.fname);
		System.out.println("Last Name: " + person.bestFriend.lname);


	}

}
