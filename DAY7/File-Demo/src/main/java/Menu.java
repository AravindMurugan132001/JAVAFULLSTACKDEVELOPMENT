import java.util.Scanner;
public class Menu {
        private Scanner scanner;

        public Menu(Scanner scanner) {
            this.scanner = scanner;
        }
        @Override
        public int showMenu() {
            System.out.println("1.Add Contact");
            System.out.println("2.Show Contact ");
            System.out.println("3.Delete Contact ");
            System.out.println("4.Exit");
            System.out.print(" Enter Your Choice : ");
            return scanner.nextInt();

        }

    }

}
