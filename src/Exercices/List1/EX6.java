package Exercices.List1;

import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de operações de 2° grau");
        int a = 1, b = 12, c = -13;

        System.out.println("Delta (Δ) ");
        int delta = b * b - 4*a*c;

        System.out.printf("Seu delta é:" + delta + "%n");

        int Raiz_Delta = (int) Math.sqrt(delta);

        System.out.printf("Raiz quadrada de delta é:" + Raiz_Delta + "%n");

        int x1 = -b + Raiz_Delta / 2*a;
        int x2 = -b - Raiz_Delta / 2*a;

        System.out.printf("Os resultados da sua equação são:" + "%n"+ x1 + "(+)" + "%n"+ x2 + "(-)");

        scan.close();
    }
}
