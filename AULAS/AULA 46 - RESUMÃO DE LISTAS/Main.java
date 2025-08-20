import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //ARRAY É ESTATICO
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";

        System.out.println("-----------------------------------");

        System.out.println("Referencia de memoria: " + nomeNinjaArray);
        System.out.println(nomeNinjaArray[0]);
        System.out.println("-----------------------------------");
        for (int i = 0; i < nomeNinjaArray.length; i++) {
            System.out.println(nomeNinjaArray[i]);
        }

        System.out.println("------------------------------------");

        //LIST - É UM SUPER ARRAY E É LENTO

        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("NARUTO UZUMAKI");
        nomeNinjaList.add("SASUKE UCHIHA");
        nomeNinjaList.add("SAKURA HARUNO");
        System.out.println(nomeNinjaList);
        System.out.println(nomeNinjaList.get(0));
    }
}