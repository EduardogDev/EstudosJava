package NivelIntermediario;

public abstract class ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private double altura = 2.10;

    public ninja(){

    }
    public ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.altura = altura;
    }

    // TIRAR DADOS OU MOSTRAR PARA O USUARIO EU USO O GET + NOME DA VARIAVEL
    /*
    public String getNome() {
        return nome;
    }
    public double getAltura() {
        return altura;
    }

    //SETEERS RECEBE VALORES
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

