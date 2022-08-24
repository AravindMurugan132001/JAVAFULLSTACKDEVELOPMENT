package com.nseit.springTodo;

import com.nseit.springTodo.model.Todo;
import com.nseit.springTodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTodoApplication implements CommandLineRunner {

    @Autowired
    private TodoService todoService;

    public static void main(String[] args) {
        SpringApplication.run(SpringTodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo(1, "saas", false);

        todoService.add(todo);

        todoService.view();

        Todo todo1 = new Todo(2, "saas 2", false);
        todoService.add(todo1);

        todoService.update(2);

        todoService.view();

        todoService.delete(2);

        todoService.view();
    }
}
