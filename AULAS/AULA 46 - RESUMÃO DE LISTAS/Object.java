public record Object(String nome,int idade) {
    void mostrarInformações(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

}