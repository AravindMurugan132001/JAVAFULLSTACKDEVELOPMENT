package com.nseit.springTodo.repository;

import com.nseit.springTodo.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Getter
public class TodoRepository {
    private ArrayList<Todo> todos = new ArrayList<>();
}
