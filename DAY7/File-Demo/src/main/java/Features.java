import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Features {

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

    interface FeatureInterface {
        void addContact();

        void showContacts();

        void deleteContact();
    }

    public class Features implements FeatureInterface {
        private Scanner scanner;


        public Features() {
            this.scanner = scanner;

        }

        public void addContact() {
            //LocalDateTime date = LocalDateTime.now();
            //System.out.println(date);
            System.out.print("Enter the Contact Name    :    ");
            String name = scanner.next();
            System.out.print("Enter the Contact Number   :    ");
            String number = scanner.next();
            Pattern pattern = Pattern.compile("(0|91)?[6-9][0-9]{9}");
            Matcher matcher = pattern.matcher((number));
            if (matcher.find()) {
                FileWriter fileWriter = new FileWriter("D:\\JFSD\\DAY7\\contactList.txt");
                fileWriter.write(name);
                fileWriter.write(number);
                System.out.println("Contact Added Successfully  ---->" + name + " - " + number);
            } else System.out.println("Enter valid Mobile Number : ");
            //contactsList.add(new Contact(contactsList.size() + 1, name, number));
        }

        public void showContacts() {
            Scanner input = new Scanner(new File("D:\\JFSD\\DAY7\\contactList.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            System.out.println("No Such Contact Availabel");
        }

    }


    public void deleteContact() {
        System.out.print("Enter Contact Name To Delete    :   ");
        String nameToDelete = scanner.next();

        boolean isExit = false;
        for (Contact contact : contactsList) {
            if (contact.getName().equals(nameToDelete)) {
                contactsList.remove(contact);
                isExit = true;
                break;
            }
        }
        if (isExit) {
            System.out.println("Contact Deleted Successfully");
        } else {
            System.out.println("Contact Not Found");
        }

    }
}

}
