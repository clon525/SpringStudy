package ru.javalang.item03.sample03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.item03.sample03.config.ProjectConfig;
import ru.javalang.item03.sample03.model.Company;
import ru.javalang.item03.sample03.model.Person;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1 = context.getBean(Person.class);

        Company company = context.getBean(Company.class);

        System.out.println(person1);

        System.out.println(company);

    }
}
