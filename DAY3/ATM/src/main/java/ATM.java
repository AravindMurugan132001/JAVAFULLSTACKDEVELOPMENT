import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create Objects for Class

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        int amount = 0;

        while (true) {
            menu.display();
            int choice = menu.getUserChoice();
            switch (choice) {
                case 1:
                    System.out.print("Enter The Amount To Withdraw : ");
                    amount = scanner.nextInt();
                    Withdraw withdraw = new Withdraw(amount);
                    //menu.display();
                    break;
                case 2:
                    System.out.println("Enter The Amount To Deposit : ");
                    amount = scanner.nextInt();
                    Deposit deposit = new Deposit();
                    deposit.dept(amount);
                    //menu.display();
                    break;
                case 3:
                    Balance balance = new Balance();
                    break;
                case 4:
                    Utils.thankYou();
                    System.exit(0);
                    break;
                default:
                    System.out.println("**Please Enter Valid Input**");
                    //menu.display();
                    break;
            }
        }
    }
}


