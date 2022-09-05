package ru.javalang.item03.sample03.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Применение стереотипной аннотации к классу
 * позволяет создать экземпляр этого класса и добавить его в контекст
 */
@Component
public class Person {
    private String name;

    // Внедрение через поле
//    @Autowired
//    @Qualifier("company")
    private Company company;

    // Выполнение операций после создания бина
    // Зависимость Javax.annotation в Maven после Java11
    @PostConstruct
    public void init(){
        this.name = "Alex";
    }

    public Person() { }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    // Внедрение через конструктор
//    @Autowired
    public Person(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Внедрение через Setter
    @Autowired
    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", company=" + company +
                '}';
    }
}
