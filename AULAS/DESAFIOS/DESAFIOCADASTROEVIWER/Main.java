import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("DIGITE UMA OPÇÃO: ");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Sair");
            System.out.println("-------------------------------------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = digite.nextInt();
            digite.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    Usuarios usuario = new Usuarios();
                    System.out.print("Digite o nome do cliente: ");
                    usuario.nome = digite.nextLine();
                    System.out.print("Digite a idade do cliente: ");
                    usuario.idade = digite.nextInt();
                    System.out.print("Digite o saldo do cliente: ");
                    usuario.saldo = digite.nextFloat();
                    digite.nextLine(); // Limpa o buffer

                    listaUsuarios.add(usuario);
                    System.out.println("Cliente cadastrado com sucesso!\n");
                    break;

                case 2:
                    if (listaUsuarios.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado ainda.\n");
                    } else {
                        System.out.println("\n--- LISTA DE CLIENTES ---");
                        for (Usuarios u : listaUsuarios) {
                            u.mostrarInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }

        } while (opcao != 3);
    }
}
