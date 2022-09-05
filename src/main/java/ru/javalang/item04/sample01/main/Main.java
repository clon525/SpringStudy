package ru.javalang.item04.sample01.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.item04.sample01.configuration.ProjectConfiguration;
import ru.javalang.item04.sample01.model.Comment;
import ru.javalang.item04.sample01.services.CommentService;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    var comment = new Comment();
    comment.setAuthor("Алекс");
    comment.setText("Просто комментарий");

    var commentService = context.getBean(CommentService.class);
    commentService.publishComment(comment);
  }
}
