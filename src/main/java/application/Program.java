package main.java.application;

import main.java.model.entities.Address;
import main.java.model.entities.Menu;
import main.java.model.entities.ReadFile;

import java.util.ArrayList;
import java.util.List;
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

        List<String> answer = new ArrayList<>();
        List<String> questions = ReadFile.readQuestion();

        for (int i = 0; i < questions.size(); i++) {
            if (i == 3){
                System.out.println(ReadFile.readQuestion().get(i));

                System.out.print("Número da casa: ");
                String houseNumber = scan.nextLine();

                System.out.print("Cidade: ");
                String city = scan.nextLine();

                System.out.print("Rua: ");
                String street = scan.nextLine();

                if (houseNumber == null) {
                    houseNumber = "NAO_INFORMADO";
                }

                Address address = new Address(houseNumber, city, street);
                i++;
            }
            System.out.println(ReadFile.readQuestion().get(i));
            answer.add(scan.nextLine());
        }

    }
}
