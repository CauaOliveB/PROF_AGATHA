package Exercices.List1;

import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de área (Triângulo)");

        System.out.println("Altura:");
        int a = scan.nextInt();

        System.out.println("Base:");
        int b = scan.nextInt();

        System.out.println("Base:" + b);
        System.out.println("Altura:" + a);

        int A = a * b;

        System.out.println("Área :" + A);

        scan.close();
    }
}
