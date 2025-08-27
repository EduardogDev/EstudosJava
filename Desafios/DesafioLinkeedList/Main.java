import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninjas> ninjas = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        String aldeia;

        while (true) {

            System.out.println("1 - CADASTRAR NINJA\n2 - LISTAR NINJAS\n3 - PESQUISAR NINJA\n4 - REMOVA O ULTIMO NINJA CADASTRADO\n5 - SAIR");
            System.out.println("-------------------------------------------------\nDigite uma opção");
            String opcao = scan.nextLine();

            if (opcao.equals("1")){
            System.out.println("-------------------------------------------------\nINICIO DO CADASTRO:");
            System.out.print("DIGITE O NOME DO NINJA:  ");
            nome = scan.nextLine().toUpperCase();
            System.out.print("DIGITE A IDADE DO NINJA:  ");  
            idade = scan.nextInt();
            scan.nextLine();
            System.out.print("DIGITE A ALDEIA DO NINJA:  ");
            aldeia = scan.nextLine().toUpperCase();
            System.out.println("-------------------------------------------------");
            Ninjas ninja = new Ninjas(nome, idade, aldeia);
            ninjas.add(ninja);
            System.out.println("NINJA CADASTRADO " + nome +" COM SUCESSO!!");
            System.out.println("-------------------------------------------------");

            }else if (opcao.equals("2")) {
                if(ninjas.isEmpty()) {
                    System.out.println();
                    System.out.println("----------------------------------------- ---------------");
                    System.out.println("NÃO HÁ NINJAS CADASTRADOS!!");
                    System.out.println("--------------------------------------------------------");
                }else {
                    for (Ninjas ninjas2 : ninjas) {
                        System.out.println(ninjas2);
                        System.out.println("--------------------------------------------------------");
                    }
            }
            }else if (opcao.equals("4")) {
                while (true) {
                    System.out.println("TEM CERTEZA QUE DESEJA EXCLUIR O ULTIMO NINJA CADASTRADO? s/n");
                    String opcao3 = scan.nextLine().toLowerCase();
                    switch (opcao3) {
                        case "s":
                            System.out.println("REMOVENDO ULTIMO NINJA...");
                            ninjas.removeLast();
                            break;
                        case "n":
                            System.out.println("SAINDO...");
                            scan.close();
                            break;                    
                        default:
                            System.out.println("HOUVE ALGUM ERRO, TENTE NOVAMENTE...");
                    }
                    break;
                }               
        }
        }
            
        }
    }
