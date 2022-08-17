import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void display() {
        System.out.println("Welcome To ATM");
        System.out.println("Choose 1. for Withdrawal");
        System.out.println("Choose 2. for Deposit");
        System.out.println("Choose 3. for View Balance");
        System.out.println("Choose 4. for Exit");
        System.out.println("Enter Your Choice : ");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }
}
