package TryCatch;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExercices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);




        System.out.println("Insira sua operação:\n" +
                "[ 1 ] Adição\n" +
                "[ 2 ] Subtração\n" +
                "[ 3 ] Multiplicação\n" +
                "[ 4 ] Divisão\n" +
                "[ 5 ] Potenciação\n");

        int choice = scan.nextInt();


        System.out.println("Insira um número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira um segundo número: ");
        int num2 = scan.nextInt();

        switch (choice) {
            case 1 :
                try {
                    int soma = num1 + num2;
                    System.out.printf("Soma: %d", soma);
                } catch (InputMismatchException e) {
                    System.out.println("Erro : Insira um valor válido!");
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Não foi possível realizar a soma");
                    break;
                }

            case 2 :
                try {
                    int subtracao = num1 - num2;
                    System.out.printf("Soma: %d", subtracao);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Não foi possível realizar a subtração");
                }catch (InputMismatchException e) {
                    System.out.println("Erro : Insira um valor válido!");
                    break;
                }

            case 3 :
                try {
                    int multiplacao = num1 * num2;
                    System.out.printf("Multiplicação: %d", multiplacao);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Não foi possível realizar a multiplicação");
                }catch (InputMismatchException e) {
                    System.out.println("Erro : Insira um valor válido!");
                    break;
                }

            case 4 :
                try {
                    int divisao = num1 / num2;
                    System.out.printf("Divisão: %d", divisao);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Não foi possível realizar a divisão");
                }catch (InputMismatchException e) {
                    System.out.println("Erro : Insira um valor válido!");
                    break;
                }

            case 5 :
                try {
                    int potenciacao = num1 ^ num2;
                    System.out.printf("Potenciação: %d", potenciacao);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Não foi possível realizar a potenciação");
                }catch (InputMismatchException e) {
                    System.out.println("Erro : Insira um valor válido!");
                    break;
                }
            default:
                System.out.println("Valor inserido não identificado pelo sistema!");




            }
        }
    }


