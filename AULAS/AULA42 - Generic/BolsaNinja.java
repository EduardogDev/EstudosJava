
import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    // INICIALIZAR ARRAY

    private List<T> ferramentas;

    //COLOCAR FERRAMENTAS NA LISTA
    public void adicionarferramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //M0STRAR LISTA DE FERRAMTNAS
    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}


