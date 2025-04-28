package Exercices;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura(F)° :");;
        double Fahrenheit = scan.nextDouble();

        System.out.printf("Sua temperatura: %.0f (Fº)%n", Fahrenheit);

        double Celcius = 1.8 / (Fahrenheit - 32);
        System.out.printf("Sua temperatura em Celcius: %.0f (C°)%n ", Celcius);

        scan.close();
    }
}
