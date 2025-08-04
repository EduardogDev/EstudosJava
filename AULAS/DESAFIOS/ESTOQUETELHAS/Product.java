import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String nome;
    private int quantidade;
    private double preco;

    public Product(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public double calcularValorTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, Quantidade: %d, Valor Total: R$ %.2f", nome, quantidade, calcularValorTotal());
    }

    public void imprimirInformacoes() {
        System.out.println("NOME: " + nome);
        System.out.println("QUANTIDADE: " + quantidade);
        System.out.println("PREÇO: " + preco);
    }
}
