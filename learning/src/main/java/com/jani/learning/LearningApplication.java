package com.jani.learning;

import com.jani.learning.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("/props/application-dev.properties")
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication  app = new SpringApplication(LearningApplication.class);
		ConfigurableApplicationContext context = app.run();
		Student student = context.getBean(Student.class);
		//student.setName("Jani");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		//comments
	}

}
