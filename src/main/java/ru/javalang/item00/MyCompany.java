package ru.javalang.item00;

public class MyCompany extends Company{
    public static Company myCompany = new Company();
    public MyCompany() {
        myCompany.setName("NanoSoft");
    }

    public static Company create(){
        return myCompany;
    }

}
