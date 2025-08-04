package NivelIntermediario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ARRAY ESTATICO
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura haruno";
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        // LISTA, NÃO SÃO ESTATICAS
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sakura");
        ninjasList.add("Sasuke");
        System.out.println(ninjasList);

        //ADICIONAR A LISTA
        ninjasList.add("kakashi");

        //REMOVER DA LISTA
        ninjasList.remove("kakashi");

        //TROCAR ELEMENTO DA LISTA
        ninjasList.set(2, "Obito");

        //VER TAMANHO DA LISTA
        System.out.println(ninjasList.size());
    }
}
