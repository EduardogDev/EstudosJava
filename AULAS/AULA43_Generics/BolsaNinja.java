import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    private List<T> ferramentas;
    // Inicializar a lista de ferramentas
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }
    // Colocar ferramentas na lista
    public void adicionarferramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }
    // Mostrar lista de ferramentas
    public void mostrarFerramenta() {
                for (T ferramenta : ferramentas) {
                    System.out.println(ferramenta);
                }
            }
    public List<T> getFerramentas() {
        return ferramentas;

    }
    
}

