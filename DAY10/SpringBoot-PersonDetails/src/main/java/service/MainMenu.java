package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonData;

import java.security.PrivateKey;
import java.util.Scanner;

@Service

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    public void displaymenu() {
        while (true) {
            System.out.println("-----------------");
            System.out.println("1.Add Details");
            System.out.println("2.Update Details");
            System.out.println("3.View Details");
            System.out.println("4.Delete Details");
            System.out.println("5.EXIT");
            System.out.println("-----------------");

            System.out.print("Your Choice Please : ");
            int Choice = scanner.nextInt();
            switch (Choice){
                case 1:
                    System.out.println("Enter Name");
                    add()

            }

        }
    }

    @Autowired
    private PersonData personData;

    public void add() {


    }

    public void update() {

    }

    public void view() {

    }

    public void delete() {

    }
}
