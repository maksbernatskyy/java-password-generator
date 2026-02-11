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

        // Giorno di nascita
        System.out.println("Write your day of birth");
        int dayOfBirth = input.nextInt();

        // Mese di nascita
        System.out.println("Write your month of birth");
        int monthOfBirth = input.nextInt();
    
        // Anno di nascita
        System.out.println("Write your year of birth");
        int yearOfBirth = input.nextInt();

        // Somma della data
        int sumYear = dayOfBirth + monthOfBirth + yearOfBirth; 

        // Chiudo l'input
        input.close();

        // Output della password, metodo utilizzato per codice più pulito
        System.out.println(
            String.format("Your password is: %s-%s-%s-%s",
                firstName,
                secondName,
                favouriteColour,
                sumYear
            )
        );
    }
}
