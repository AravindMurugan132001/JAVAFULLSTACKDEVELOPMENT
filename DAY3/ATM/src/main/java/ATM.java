import java.awt.*;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        long initialBalance = 100_000;
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int Choice;
        do {
            menu.display();
            System.out.print("Enter Your Choice : ");
            Choice = scanner.nextInt();
           // System.out.println(Choice);
            switch (Choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("***Thank You For Visiting***");
                    System.exit(0);
                    break;
                default:
                    System.out.println("**Please Enter Valid Input**");
                    break;
            }

        }
        while (Choice > 0 && Choice < 5);
        System.out.println("***Thank You For Visiting***");

    }

}
