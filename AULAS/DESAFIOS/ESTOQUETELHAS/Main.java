import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Atualizar produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    int quantidade = lerInteiro(scanner, "Quantidade: ");
                    double preco = lerDouble(scanner, "Preço: ");
                    Product produto = new Product(nome, quantidade, preco);
                    if (estoque.adicionarProduto(produto)) {
                        System.out.println("Produto adicionado com sucesso!");
                    } else {
                        System.out.println("Produto com nome duplicado!");
                    }
                    break;
                case "2":
                    System.out.print("Nome do produto a remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (estoque.removerProduto(nomeRemover)) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                case "3":
                    System.out.println(estoque.listarProdutos());
                    break;
                case "4":
                    System.out.print("Nome do produto a atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    if (!estoque.existeProduto(nomeAtualizar)) {
                        System.out.println("Produto não encontrado!");
                        break;
                    }
                    int novaQuantidade = lerInteiro(scanner, "Nova quantidade: ");
                    double novoPreco = lerDouble(scanner, "Novo preço: ");
                    if (estoque.atualizarProduto(nomeAtualizar, novaQuantidade, novoPreco)) {
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Erro ao atualizar produto!");
                    }
                    break;
                case "0":
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        System.out.println("\nResumo final do estoque:");
        System.out.println(estoque.listarProdutos());
        System.out.println("-------------------------------");
        scanner.close();
    }

    // Métodos utilitários para validação de entrada
    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Double.parseDouble(scanner.nextLine().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número válido.");
            }
        }
    }
}