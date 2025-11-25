package main.java.model.service;

import main.java.model.entities.ReadFile;
import main.java.model.exception.DataNull;
import main.java.model.exception.ImcompletName;
import main.java.model.exception.NotNumber;

import static java.lang.Double.parseDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PetService {

    public static void RegisterPet() {
        Scanner scan = new Scanner(System.in);

        List<String> answer = new ArrayList<>();
        List<String> questions = ReadFile.readQuestion();

        for (int i = 0; i < questions.size(); i++) {
            if (i == 3){
                System.out.println(ReadFile.readQuestion().get(i));

                System.out.print("Número da casa: ");
                String houseNumber = scan.nextLine();

                System.out.print("Cidade: ");
                String country = scan.nextLine();

                System.out.print("Rua: ");
                String street = scan.nextLine();

                String adreess = houseNumber + "," + country + "," + street;

                answer.add(adreess);
                i++;
            }
            System.out.println(ReadFile.readQuestion().get(i));
            answer.add(scan.nextLine());
        }

        for (int i = 0; i < questions.size(); i++) {

            switch (i) {
                case 0:
                    Boolean character = specialCharacter(answer.get(i));

                    if (character == false)
                        throw new ImcompletName("É necessário preencher nome e sobrenome do pet e não utilize caracteres especiais.");

                    if (answer.get(i).isEmpty())
                        throw new DataNull("É necessário preencher o campo " + questions.get(i));
                    break;
                case 1:
                    if (validNumbers(answer.get(i)) == false) {
                        throw new NotNumber("É necessário inormar um número válido.");
                    }
            }
        }
    }

    public static boolean specialCharacter(String s) {
        String[] names = s.split(" ");

        for(String n : names) {
            int count = 0;

            while(count < n.length()) {
                char caracter = n.charAt(count);
                if(!Character.isLetter(caracter)) return true;
                count++;
            }
        }
        return false;
    }

    public static boolean validNumbers(String values) {
        try {
            Double.parseDouble(values);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
