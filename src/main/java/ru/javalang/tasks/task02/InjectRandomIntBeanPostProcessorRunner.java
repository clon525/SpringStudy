package ru.javalang.tasks.task02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.javalang.item05.sample10.BeanPostProcessorImpl;
import ru.javalang.item05.sample10.Message;

public class InjectRandomIntBeanPostProcessorRunner {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyBean.class, InjectRandomIntBeanPostProcessor.class);

        MyBean myBean = (MyBean) context.getBean(MyBean.class);
        System.out.println("\n==================================");
        System.out.println(myBean.toString());
        System.out.println("==================================\n");
        context.registerShutdownHook();
    }
}
