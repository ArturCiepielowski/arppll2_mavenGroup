package pl.sda.arppl;

import java.util.Scanner;

public class KlasaAla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz swoje imie: ");
        String imie = scanner.next();

        System.out.println("podaj swoje nazwisko");
        String nazwisko = scanner.next();

        System.out.println("podaj numer buta");
        int rozmiar =scanner.nextInt();

        System.out.println("Oj, " + imie + " " + nazwisko + " - ale masz nogę! Twój rozmiar to " + rozmiar + "?!");
    }
}