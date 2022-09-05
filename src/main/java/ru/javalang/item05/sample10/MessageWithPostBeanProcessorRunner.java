package ru.javalang.item05.sample10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageWithPostBeanProcessorRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Message.class,BeanPostProcessorImpl.class);

        Message message = (Message) context.getBean("message");
        System.out.println("\n==================================");
        System.out.println(message.getMessage());
        System.out.println("==================================\n");
        context.registerShutdownHook();
    }
}
