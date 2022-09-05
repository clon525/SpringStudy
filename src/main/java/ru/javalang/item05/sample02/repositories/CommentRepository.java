package ru.javalang.item05.sample02.repositories;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {
    public String getComment(){
        return "Какой-то комментарий";
    }
}
