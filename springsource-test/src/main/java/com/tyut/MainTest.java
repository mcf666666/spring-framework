package com.tyut;

import com.tyut.bean.Cat;
import com.tyut.bean.Person;
import com.tyut.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
//		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
//
//		Person person = classPathXmlApplicationContext.getBean(Person.class);
//
//		System.out.println(person);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person1 = applicationContext.getBean(Person.class);
		Person person2 = applicationContext.getBean(Person.class);
		System.out.println("因为默认scope是单例模式，所以获取的两个对象应该是一样的，结果应该是true:" + (person1 == person2));

		Cat cat1 = applicationContext.getBean(Cat.class);
		Cat cat2 = applicationContext.getBean(Cat.class);
		System.out.println("指定为原型模式，所以获取的两个对象应该是不一样的，结果应该是false：" + (cat1 == cat2));

		Cat cat3 = person1.getCat();
		Cat cat4 = person1.getCat();
		System.out.println("虽然Cat为原型模式，但是Person是单例模式，所以获取的两个cat也是一样的，结果应该是true：" + (cat3 == cat4));

		//加上了Lookup注解、并且不是以@Bean的形式注入到容器中，而是以@Component形式注入
		Cat cat5 = person1.getCat();
		Cat cat6 = person1.getCat();
		System.out.println("虽然Cat为原型模式，但是Person是单例模式，但是因为@lookup，找cat对象时从容器中找，结果应该是false：" + (cat5 == cat6));
	}
}
