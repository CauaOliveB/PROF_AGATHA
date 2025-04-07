package Array;

import java.util.Scanner;

public class JogosNomesInterativos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many names you want to digit");
        int quantidade = input.nextInt();
        input.nextLine();

        String[] names = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Write the name:" + (i + 1) + " : ");
        }

        int CountDea = 0;

        String name = null;
        for (int i = 0; i < names.length; i++) {
            name = names[i];
        }

        if (name.startsWith("A") || name.startsWith("a")) {
            CountDea++;
        }
        System.out.println("Você digitou");

    }
}
