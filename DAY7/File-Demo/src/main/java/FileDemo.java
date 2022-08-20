import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDemo {

    public class App {
        public static void main(String[] args) throws FileNotFoundException {

            File file=new File("D:\\JFSD\\DAY7\\contactList.txt");
            Scanner scanner = new Scanner(System.in);
            Scanner sc = new Scanner(file);
            Menu menu = new Menu(scanner);
            Features features = new Features();

            while (true) {
                int choice = menu.showMenu();
                switch (choice) {
                    case 1 -> features.addContact();
                    case 2 -> features.showContacts();
                    case 3 -> features.deleteContact();
                    case 4 -> {
                        System.out.println("            *** Thanks For Spending Your Valuable Time ***");
                        System.exit(0);
                    }
                    default -> System.out.println("Please Enter Valid Input");
                }

            }
        }
    }

}
