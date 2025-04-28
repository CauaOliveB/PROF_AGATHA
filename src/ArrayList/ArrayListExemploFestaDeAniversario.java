package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExemploFestaDeAniversario {
    public static void main(String[] args) {

        ArrayList<String> ListaDeAmigos = new ArrayList<>();

        ListaDeAmigos.add("Marcos");
        ListaDeAmigos.add("Cássia");
        ListaDeAmigos.add("Marceline");

        System.out.println("Amigos que vão a festa:");

        for(String amigo : ListaDeAmigos){
            System.out.println(amigo);
        }

        //Mostrando o total de amigos na festa
        System.out.println("Total de amigos:" + ListaDeAmigos.size());


        //Acessando um elemento especígico da lista pelo seu indice
        System.out.println("Total de amigos:" + ListaDeAmigos.get(1));

        //Removendo um amigo da lista
        ListaDeAmigos.remove("Luca");

        //Informamdp que a lista foi atualizada pela remoção
        System.out.println("Luca não vai firme. Lista atualizada");

        for (String amigo : ListaDeAmigos ){
            System.out.println(amigo);
        }
    }
}
