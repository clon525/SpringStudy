package ru.javalang.item03.sample03.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ru.javalang.item03.sample03.model")
public class ProjectConfig {

}