package ru.javalang.item00;

public class IvanovPerson extends Person{
    public static Person ivanovPerson = new Person();

    public IvanovPerson(){
        ivanovPerson.setName("Иван Иванов");
        ivanovPerson.setCompany(MyCompany.create());
    }

    public static Person create(){
        return ivanovPerson;
    }
}
