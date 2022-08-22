import Service.TodoService;
import Service.TodoServiceImpl;
import Utils.TodoUtils;
import model.Todo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoUtils todoUtils = new TodoUtils();
        ArrayList<Todo> todos = todoUtils.getTodos();
        TodoServiceImpl todoService = new TodoServiceImpl(todos, scanner);

        todoService.printMainMenu();

    }
}
