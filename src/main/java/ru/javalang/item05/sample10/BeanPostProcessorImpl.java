package ru.javalang.item05.sample10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Currency;

@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            if (fields[i].isAnnotationPresent(CurrencyField.class)){
                fields[i].setAccessible(true);
                try {
                    sort((int[]) fields[i].get(bean));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("postProcessBeforeInitialization method called for: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization method called for: " + beanName);
        return bean;
    }

    public void sort (int[] mass){
        Arrays.sort(mass);
    }
}
