public class Usuarios {

    String nome;
    int idade;
    float saldo;

    public void mostrarInformacoes() {
        System.out.println("-------------------------------------------------------");
        System.out.println("O cliente se chama: " + nome);
        System.out.println("A idade do cliente é: " + idade);
        System.out.println("Seu saldo é de: R$" + saldo);
        System.out.println("-------------------------------------------------------");
    }
}
