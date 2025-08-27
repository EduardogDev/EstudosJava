public class Ninjas {

    private String nome;
    private int idade;
    private String aldeia;
    
    
    public Ninjas() {
    }
    public Ninjas(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getAldeia() {
        return aldeia;
    }
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
    @Override
    public String toString() {
        return "Ninjas [nome=" + nome + ", idade=" + idade + ", aldeia=" + aldeia + "]";
    }
    
}

    

    //
    
    


    
    

