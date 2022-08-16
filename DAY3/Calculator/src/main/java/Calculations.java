import java.util.Scanner;

public class Calculations {
    Scanner scanner = new Scanner(System.in);

    public int add() {
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The A and B Values : ");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne + numTwo;
    }

    public int mul() {
        System.out.println("Enter The A and B Values : ");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne * numTwo;
    }

    public int sub() {
        System.out.println("Enter The A and B Values : ");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne - numTwo;
    }

    public int div() {
        System.out.println("Enter The A and B Values : ");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne / numTwo;
    }

    public int mod() {
        System.out.println("Enter The A and B Values : ");
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        return numOne % numTwo;
    }

}
