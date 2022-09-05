package ru.javalang.item04.sample01.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"ru.javalang.item04.sample01.proxies"
                , "ru.javalang.item04.sample01.services"
                , "ru.javalang.item04.sample01.repositories"}
)
public class ProjectConfiguration {
}
