package Array;

public class JogoNomesArray {
    public static void main(String[] args) {

        String[] Gods = {"Hécate", "Aphrodite", "Hermes", "Poseidon", "Athena"};

        int countDeA = 0;

        for (int i = 0; i < Gods.length; i++) {
            String nome = Gods[i];
            if (nome.startsWith("a")) {
                countDeA++;
            }

        }
        System.out.println("Quantidades de nomes que começam com a letra A:" + countDeA);
    }
}
