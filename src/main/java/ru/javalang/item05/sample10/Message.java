package ru.javalang.item05.sample10;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
@Currency
public class Message {
    private String message;

    @CurrencyField
    private int[] counts = {21, 23, 35, 24};

    public String getMessage() {
        return "Message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCounts() {
        return "Counts: " + Arrays.toString(counts);
    }

    public void setCounts(int[] counts) {
        this.counts = counts;
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
