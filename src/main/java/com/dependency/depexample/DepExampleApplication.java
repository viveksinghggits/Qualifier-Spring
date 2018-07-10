package com.dependency.depexample;

import com.dependency.depexample.controller.ConstructorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepExampleApplication {

    public static void main(String[] args) {

        ApplicationContext context =  SpringApplication.run(DepExampleApplication.class, args);
        ConstructorController constructorController = (ConstructorController) context.getBean("constructorController");
        System.out.println(constructorController.sayHello());
    }
}
