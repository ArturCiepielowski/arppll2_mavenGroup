package pl.sda.arppl;

import java.util.Scanner;

public class KlasaAla2 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Wpisz swoje imie: ");
    String imie = scanner.next();

    System.out.println("podaj nazwisko: ");
    String nazwisko = scanner.next();

    System.out.println("podaj liczbe z przecinkami: ");
    double zmienna1 =scanner.nextDouble();

    System.out.println("podaj inna z przecinkami: ");
    double zmienna2 =scanner.nextDouble();

    double raz = zmienna1 +zmienna2;
    double dwa = zmienna1 - zmienna2;


    System.out.println("Hej, " + imie + " " + nazwisko + " roznica tych liczb to "+raz+", a suma "+dwa+" ");
}}