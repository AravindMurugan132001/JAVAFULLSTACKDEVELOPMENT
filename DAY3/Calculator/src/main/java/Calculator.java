import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Menu menu = new Menu();
        Calculations calculations = new Calculations();

        menu.display();
        System.out.print("Enter Your Choice : ");
        int choice = obj.nextInt();

        /*System.out.println("Enter The A and B Values : ");
        int numOne = obj.nextInt();
        int numTwo = obj.nextInt();*/

        if (choice > 0 && choice < 6) {
            switch (choice){
                case 1:
                    System.out.println("The Addition Of A and B is : " + calculations.add());
                    break;
                case 2:
                    System.out.println("The Subtraction Of A and B is : " + calculations.mul());
                    break;
                case 3:
                    System.out.println("The Multiplication Of A and B is : " + calculations.sub());
                    break;
                case 4:
                    System.out.println("The Division Of A and B is : " + calculations.div());
                    break;
                case 5:
                    System.out.println("The Modulo Of A and B is : " + calculations.mod());
                    break;
            }
        }
        else {
            System.out.println("Enter Valid Option Given : ");

        }
    }


}




