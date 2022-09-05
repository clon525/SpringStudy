package ru.javalang.item04.sample01.repositories;

import org.springframework.stereotype.Component;
import ru.javalang.item04.sample01.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Запись комментария: " + comment.getText());
  }
}
