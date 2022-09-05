package ru.javalang.item05.sample01.services;

public class CommentService {

    String message;

    public CommentService() {
        System.out.println("Created object: " + this);
    }

    public CommentService(String message) {
        this.message = message;
    }
}
