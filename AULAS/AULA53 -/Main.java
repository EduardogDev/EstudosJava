import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       
        List<String> lista = new ArrayList<>();
        lista.add("NARUTO UZUMAKI");
        lista.add("SASUKE UCHIHA");
        lista.add("SAKURA HARUNO");

        System.out.println(lista);
        //================================================//        

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(lista);
        ninjasSet.remove("naruto uzumaki");
    
        System.out.println(ninjasSet);


        
    }
}
