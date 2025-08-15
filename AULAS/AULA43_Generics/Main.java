public class Main {
    public static void main(String[] args) {
        // Criando uma bolsa ninja para Kunai
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        // Adicionando kunais à bolsa
        bolsaNinja.adicionarferramenta(new Kunai("Kunai de Madeira"));
        bolsaNinja.adicionarferramenta(new Kunai("Kunai de Aço"));
        bolsaNinja.adicionarferramenta(new Pergaminho("Aprendendo a clonar"));
        bolsaNinja.adicionarferramenta(new Shuriken(10));
        bolsaNinja.adicionarferramenta(new CompanheiroNinja("Mekameru"));

        // Mostrando as kunais na bolsa
       System.out.println("Ferramentas na bolsa ninja:");
        bolsaNinja.mostrarFerramenta();
    }
}
