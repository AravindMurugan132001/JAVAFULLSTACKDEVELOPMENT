package com.nseit.springTodo.service;

import com.nseit.springTodo.model.Todo;
import com.nseit.springTodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void add(Todo todo) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        todos.add(todo);
    }

    public void view() {
        for (Todo todo : todoRepository.getTodos()) {
            System.out.println(todo.getId());
            System.out.println(todo.getTask());
            System.out.println(todo.isCompleted());
        }
    }

    public void update(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (todo.getId() == id) {
                todo.setCompleted(true);
                break;
            }
        }
    }

    public void delete(int id) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todos.remove(todo);
                break;
            }
        }
    }

}
