package Service;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoServiceImpl {
    private ArrayList<Todo> toDos;
    private Scanner scanner;

    public TodoServiceImpl(ArrayList<Todo> toDos, Scanner scanner) {
        this.toDos = toDos;
        this.scanner = scanner;
    }

    public void printMenu() {
        while (true){
            System.out.println("Welcome To Todo Application");
            System.out.println("---------------------------");
            System.out.println("1.Add Task");
            System.out.println("2.View Task");
            System.out.println("3.Delete Task");
            System.out.println("4.Exit");
            System.out.println("---------------------------");
            System.out.println("Enter Choice");
            int Choice = scanner.nextInt();

            switch (Choice){
                case 1 -> addTasks();
                case 1 -> viewTasks();
                case 1 -> deletTasks();
                case 1 -> System.exit(0);
                default -> {

                }
            }
        }
    }

    private void deletTasks() {
        for(Todo todo:todos){
            System.out.println(todo.getId()+" "+todo.getType()+" "+gettask());
        }
        System.out.println("---------------------------");
        printMenu();
    }

    private void viewTasks() {
        for(Todo todo:todos){
            System.out.println(todo.getId()+" "+todo.getType()+" "+gettask());
        }
        System.out.println("---------------------------");
        printMenu();

    }

    private void addTasks() {
        System.out.print("Enter The Type Of Task : ");
        String Type = scanner.next();
        System.out.print("Enter The Task : ");
        String Task = scanner.next();
        todos.add(new Todo(todos.size()+1,Type,Task));
        System.out.print("Task Added Successfully");
    }
}
