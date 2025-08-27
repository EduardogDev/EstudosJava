import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       
        List<String> lista = new ArrayList<>();
        lista.add("NARUTO UZUMAKI");
        lista.add("SASUKE UCHIHA");
        lista.add("SAKURA HARUNO");
        lista.add("KAKASHI HATAKE");
        lista.add("DANZO");
        lista.add("MINATO UZUMAKI");
        lista.add("ZIVAGO");
        //================================================// 
        
        /*
         * USAR O HASHSET QUANDO NÃO QUISER ALGUM VALOR NA LISTA DUPLICADO;
         * USAR O TREESET QUANDO QUISER UM ORDEM REGRADA DE UM DETERMINADO "TIPO"
         */

        Set<String> ninjasSet = new HashSet<>();
        //USAR QUANDO QUISER USAR SEQUENCIA CORRETA (ORDEM ALFABETICA, ORDEM NUMERICA)
        ninjasSet.addAll(lista);
        //ninjasSet.remove("naruto uzumaki");
    
        System.out.println(ninjasSet);


        
    }
}
