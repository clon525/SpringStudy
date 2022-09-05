package ru.javalang.item03.sample02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.javalang.model.Person;
import ru.javalang.model.Company;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Person person1(){
        var p = new Person();
        p.setName("Alex");
        p.setCompany(company());
        return p;
    }

    @Bean
    Person person2(){
        var p = new Person();
        p.setName("John");
        p.setCompany(company());
        return p;
    }

    @Bean
    Company company(){
        var c = new Company();
        c.setName("Company");
        return c;
    }
}
