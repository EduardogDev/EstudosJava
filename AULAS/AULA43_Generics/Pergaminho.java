

public class Pergaminho {

    private String conteudo;

    public Pergaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String toString(){
        return "Pergaminho: " + conteudo;
    }
}
