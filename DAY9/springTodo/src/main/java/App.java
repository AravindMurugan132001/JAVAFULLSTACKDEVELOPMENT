package com.nseit.springTodo.models;
import Repositories.TodoUtils;
import Service.TodoServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TodoUtils todoUtils = new TodoUtils();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Todo> todos =  todoUtils.getTodos();
        TodoServiceImpl todoService = new TodoServiceImpl(todos,scanner);
        todoService.printMenu();
        }
    }


