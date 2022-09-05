package ru.javalang.item05.sample02.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javalang.item05.sample02.config.ProjectConfig;
import ru.javalang.item05.sample02.services.CommentService;
import ru.javalang.item05.sample02.services.UserService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var s1 = c.getBean(CommentService.class);
    var s2 = c.getBean(UserService.class);

    String b = s1.getCommentRepository() == s2.getCommentRepository() ? "бины одинаковые" : "бины разные";

    System.out.println(s1.getCommentRepository().getComment());

    System.out.println(b);
  }
}
