package ru.javalang.item02setter;

public interface NewsletterSender {
    void setSmtpServer(String smtpServer); 
    String getSmtpServer();

    void setFromAddress(String fromAddress); 
    String getFromAddress();

    void send(); 
}
