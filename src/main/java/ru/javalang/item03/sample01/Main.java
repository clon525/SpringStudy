package ru.javalang.item03.sample01;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javalang.item03.sample02.config.ProjectConfig;
import ru.javalang.model.Company;
import ru.javalang.model.Person;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("spring/application-context.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

    }
}
