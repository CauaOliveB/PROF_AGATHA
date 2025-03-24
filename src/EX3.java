import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira seu peso:");
        int peso = scan.nextInt();

        System.out.println("Insira sua altura:");
        double altura = scan.nextDouble();

        double imc = peso/ (altura*altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Sua categoria é Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Sua categoria é Normal");
        } else if (imc <= 29.9) {
            System.out.println("Sua categoria é Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Sua categoria é Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Sua categoria é Obesidade Grau II");
        } else {
            System.out.println("Sua categoria é Obesidade Grau III");
        }

        scan.close();

    }
}
