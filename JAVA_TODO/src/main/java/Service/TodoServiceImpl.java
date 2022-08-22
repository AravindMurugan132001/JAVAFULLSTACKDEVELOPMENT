package Service;

import model.Todo;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoServiceImpl implements TodoService {

    private ArrayList<Todo> todos;
    private Scanner scanner;

    public TodoServiceImpl(ArrayList<Todo> todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }

    public void addTodo() {
        System.out.println("Add Todo");
        System.out.println("********");
        System.out.print("Enter your Item :");

        String item = scanner.next();
        /*Creat ToDo*/
        Todo todo = new Todo();
        // set values
        todo.setId(todos.size() + 1);
        todo.setItemName(item);
        todo.setCompleted(false);
        todos.add(todo);
    }

    @Override
    public void viewTodo() {
        System.out.println("View Todo");
        System.out.println("********");
        for (Todo todo : todos) {
            System.out.println(todo.getId() + " " + " " + todo.getItemName() + " " + "Completed Ststus - " + (todo.isCompleted() ? "Yes" : "No"));
        }
        System.out.println("********");

    }

    @Override
    public void updateTodo() {
        System.out.println("Update Todo");
        System.out.println("********");
        for (Todo todo : todos) {
            System.out.println(todo.getId() + " " + " " + todo.getItemName() + " " + "Completed Ststus - " + (todo.isCompleted() ? "Yes" : "No"));
        }
        System.out.print("Enter Choice ");
        int choice = scanner.nextInt();
        Todo todo = todos.get(choice - 1);
        todo.setCompleted(true);
        System.out.println("********");

    }


    public void printMainMenu() {
        while (true) {
            System.out.println("1.Add Todo");
            System.out.println("2.View Todo");
            System.out.println("3.Update Todo");
            System.out.println("4.Exit");
            System.out.print("Enter Your Choice : ");
            int choice = 0;

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> addTodo();
                    case 2 -> viewTodo();
                    case 3 -> updateTodo();
                    case 4 -> System.exit(0);
                    default -> System.out.println("Invalid Choice");
                }
            } catch (Exception e) {
                System.out.println("Invalid Choice");
            }

        }
    }
}
