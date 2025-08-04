import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarferramenta(new Pergaminho("Cagar de Cu pra cima"));
        bolsaNinja.adicionarferramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarferramenta(new Shuriken(3));
        bolsaNinja.adicionarferramenta(new Pergaminho("Segredo da cura gay"));
        
        System.out.println("Itens da nossa bolsa Ninja: ");
        bolsaNinja.mostrarFerramenta();

    }
}
