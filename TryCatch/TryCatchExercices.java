import java.util.Scanner;

public class TryCatchExercices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira sua operação:\n" +
                "[ + ] Adição\n" +
                "[ - ] Subtração\n" +
                "[ * ] Multiplicação\n" +
                "[ / ] Divisão\n" +
                "[ ^ ] Potenciação\n");

        String choice = scan.nextLine();

        System.out.println("Insira um número: ");
        int num1 = scan.nextInt();

        System.out.println("Insira um segundo número: ");
        int num2 = scan.nextInt();

        if (choice.equals("+")) {
            try {
                int soma = num1 + num2;
                System.out.printf("Soma: %d", soma);
            }catch (ArithmeticException e){
                System.out.println("Erro: Não foi possível realizar a soma");
            }
        }else if(choice.equals("-")) {
            try {
                int subtracao = num1 - num2;
                System.out.printf("Subtração: %d", subtracao);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não foi possível realizar a subtração");
            }
        } else if(choice.equals("*")){
            try {
                int multiplacao = num1 * num2;
                System.out.printf("Multiplicação: %d", multiplacao);
            }catch (ArithmeticException e){
                System.out.println("Erro: Não foi possível realizar a multiplicação");
            }
        } else if(choice.equals("/") ){
            try {
                int divisao = num1 / num2;
                System.out.printf("Divisão: %d", divisao);
            }catch (ArithmeticException e){
                System.out.println("Erro: Não foi possível realizar a divisão");
            }
        } else if (choice.equals("^")) {
            try {
                int potenciacao = num1 ^ num2;
            }catch (ArithmeticException e){
                System.out.println("Erro: Não foi possível realizar a potenciação");
            }
        }
    }
}

