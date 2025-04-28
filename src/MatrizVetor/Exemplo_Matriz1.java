package MatrizVetor;

import java.util.Scanner;

public class Exemplo_Matriz1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        System.out.println("Digite os valores para preencher a matriz 3x3:");

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print("Posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz digitada: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++)

    }
}
