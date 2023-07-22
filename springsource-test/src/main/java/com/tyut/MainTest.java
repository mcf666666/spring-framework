package com.tyut;

import com.tyut.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Person person = classPathXmlApplicationContext.getBean(Person.class);

		System.out.println(person);
	}
}
