package ru.javalang.item04.sample01.repositories;


import ru.javalang.item04.sample01.model.Comment;

public interface CommentRepository {

  void storeComment(Comment comment);
}
