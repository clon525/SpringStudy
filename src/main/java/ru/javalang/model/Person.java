package ru.javalang.model;

public class Person {
    private String name;
    private Company company;

    public Person() { }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
