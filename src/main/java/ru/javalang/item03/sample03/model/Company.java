package ru.javalang.item03.sample03.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Применение стереотипной аннотации к классу
 * позволяет создать экземпляр этого класса и добавить его в контекст
 */
@Component("company")
public class Company {
    private String name;

    // Выполнение операций после создания бина
    // Зависимость Javax.annotation в Maven после Java11
    @PostConstruct
    public void init(){
        this.name = "NanoSoft";
    }

    public Company() {}

    public Company(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
