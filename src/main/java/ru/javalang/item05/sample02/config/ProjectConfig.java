package ru.javalang.item05.sample02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.javalang.item05.sample02.services", "ru.javalang.item05.sample02.repositories"})
public class ProjectConfig {

}
