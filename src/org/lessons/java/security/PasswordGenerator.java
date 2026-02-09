package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // Variabile che consente di dare valori alle variabili dal terminale
        Scanner input = new Scanner(System.in);

        // Nome
        System.out.println("Write your first name");
        String firstName = input.nextLine();

        // Cognome
        System.out.println("Write your second name");
        String secondName = input.nextLine();

        // Colore preferito
        System.out.println("Write your favourite colour");
        String favouriteColour = input.nextLine();

        // Data di nascita
        System.out.println("Write your date of birth");
        String dateOfBirth = input.nextLine();

        // Chiudo l'input
        input.close();

        // Estrapolo dalla data di nascita solo l'anno
        String yearOfBirth = dateOfBirth.substring(6);

        // Output della password, metodo utilizzato per codice più pulito
        System.out.println(
            String.format("Your password is: %s-%s-%s-%s",
                firstName,
                secondName,
                favouriteColour,
                yearOfBirth
            )
        );
    }
}
