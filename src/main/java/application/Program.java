package main.java.application;

import main.java.model.entities.Menu;
import main.java.model.service.PetService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice;
        do {
            Menu.startMenu();
            choice = scan.nextInt();
        } while (choice < 1 || choice > 6);

        scan.nextLine();

        switch (choice) {
            case 1:
                PetService.RegisterPet();
                break;
        }

    }
}
