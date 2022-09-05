package ru.javalang.item03.sample04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.item03.sample03.model.Person;
import ru.javalang.item03.sample04.config.ProjectConfig;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = new Person();
        person.setName("Alex");

        Supplier<Person> personSupplier = () -> person;

//        context.registerBean("person", Person.class, personSupplier);

        context.registerBean("person",
                Person.class,
                personSupplier,
                bc -> bc.setPrimary(true));

        Person p = context.getBean(Person.class);

        System.out.println(p.getName());
    }
}
