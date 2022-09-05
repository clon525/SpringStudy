package ru.javalang.item01simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(
                        ConfigurationMessage.class
        );

        MessageRenderIf render
                = context.getBean("render",
                MessageRenderIf.class);
        render.render();
    }
}
