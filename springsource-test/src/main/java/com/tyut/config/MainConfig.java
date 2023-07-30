package com.tyut.config;

import com.tyut.bean.Cat;
import com.tyut.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

@Import({Person.class, MainConfig.MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfig {

	//	@Bean
//	public Person getPerson(){
//		return new Person("machfei");
//	}
	static class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
											BeanNameGenerator importBeanNameGenerator) {
			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
			rootBeanDefinition.setBeanClass(Cat.class);
			registry.registerBeanDefinition("666", rootBeanDefinition);
		}
	}
}
