package ru.javalang.item04.sample01.proxies;


import ru.javalang.item04.sample01.model.Comment;

public interface CommentNotificationProxy {

  void sendComment(Comment comment);
}
