package com.tyut;

import com.tyut.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");

			Person person = classPathXmlApplicationContext.getBean(Person.class);
	
			System.out.println(person);
		}
	}
