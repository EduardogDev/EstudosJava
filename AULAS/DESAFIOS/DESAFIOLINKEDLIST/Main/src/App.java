import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> ninjas = new LinkedList<>();

        while (true) {
            System.out.println("1 - CADASTRAR NOVO NINJA");
            System.out.println("2 - MOSTRAR NINJAS");
            System.out.println("3 - SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            int opcao = scanner.nextInt();     
            scanner.nextLine();    
            System.out.println("-----------------------------------------------------------------------------------------------");   
           
                switch (opcao) {
                    case 1 :
                        System.out.print("DIGITE O NOME DO NINJA: ");
                        String nome = scanner.nextLine();
                        System.out.print("DIGITE A IDADE DO NINJA: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("DIGITE A ALDEIA DO NINJA: ");
                        String aldeia = scanner.nextLine();
                        Ninja ninja = new Ninja(nome, idade, aldeia);
                        ninjas.add(ninja);
                        System.out.println("-----------------------------------------------------------------------------------------------");   
                        System.out.println("\nNINJA CADASTRADA COM SUCESSO");
                        System.out.println("-----------------------------------------------------------------------------------------------");   

                         break;
                    case 2:
                        if (ninjas.isEmpty()) {
                            System.out.println("NÃO HÁ NINJAS CADASTRADOS! ");
                            System.out.println("-----------------------------------------------------------------------------------------------");   
                        }else {
                            for (Ninja n : ninjas) {
                                System.out.println(n.toString());
                                System.out.println("-----------------------------------------------------------------------------------------------");   
                            }
                            System.out.println("DESEJA REMOVER ALGUM NINJA s/n");
                            String opcao2 = scanner.nextLine();
                            if (opcao2.equals("s"));
                            
                        } 
                        break;
                    case 3:
                        System.out.println("SAINDO...");
                        scanner.close();
                    return;
                                
                default:
                        System.out.println("TENDE NOVAMENTE");
                    break;
                }
            }
        
        
    }
}
