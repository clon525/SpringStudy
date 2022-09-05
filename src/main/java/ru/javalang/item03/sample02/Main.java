package ru.javalang.item03.sample02;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.item03.sample02.config.ProjectConfig;
import ru.javalang.model.Company;
import ru.javalang.model.Person;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1 = context.getBean("person1", Person.class);

        Company company = context.getBean("company", Company.class);

        System.out.println(person1);

        System.out.println(company);
    }
}
