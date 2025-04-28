package Exercices;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura(F)° :");;
        int Fahrenheit = scanner.nextInt();

        System.out.println("Fahrenheit:" + Fahrenheit + "F°");

        double CelsiusDecimal = (5.0 / 9.0) * (Fahrenheit - 32);
        int Celsius = (int) Math.round(CelsiusDecimal);

        System.out.println("Celcius:" + Celsius + "C°");

        scanner.close();

    }
    }
