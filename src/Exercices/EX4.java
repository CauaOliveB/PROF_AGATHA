package Exercices;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor:");
        int valor = scanner.nextInt();

        System.out.print("\n Quadrado do valor:");
        int quad = valor * valor ;
        System.out.print(quad);

        System.out.print("\n Cubo do valor:");
        int cub = valor * valor * valor;
        System.out.print(cub);

    }
}
