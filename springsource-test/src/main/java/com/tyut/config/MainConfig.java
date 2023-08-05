package com.tyut.config;

import com.tyut.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Import({Person.class, MainConfig.MyImportBeanDefinitionRegistrar.class})
@ComponentScan("com.tyut")
@Configuration
public class MainConfig {

//	@Bean
//	public Person getPerson() {
//		return new Person("machfei");
//	}
//	static class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
//		@Override
//		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
//											BeanNameGenerator importBeanNameGenerator) {
//			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
//			rootBeanDefinition.setBeanClass(Cat.class);
//			registry.registerBeanDefinition("666", rootBeanDefinition);
//		}
//	}
}
