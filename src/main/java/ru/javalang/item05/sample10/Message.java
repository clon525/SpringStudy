package ru.javalang.item05.sample10;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Message {
    private String message;

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init() {
        this.message = "Message check";
        System.out.println("Bean is in init phase.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will be destroyed now");
    }
}
