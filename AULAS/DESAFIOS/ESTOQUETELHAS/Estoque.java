import java.util.ArrayList;
import java.util.Iterator;

public class Estoque {
    private ArrayList<Product> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public boolean adicionarProduto(Product p) {
        for (Product produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(p.getNome())) {
                return false;
            }
        }
        produtos.add(p);
        return true;
    }

    public boolean removerProduto(String nome) {
        Iterator<Product> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Product produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public String listarProdutos() {
        if (produtos.isEmpty()) {
            return "Estoque vazio.";
        }
        StringBuilder lista = new StringBuilder("Estoque:\n");
        for (Product produto : produtos) {
            lista.append("- ").append(produto.toString()).append("\n");
        }
        return lista.toString();
    }
}