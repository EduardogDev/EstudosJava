public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto","naruto@gmail.com", 42208922);
        System.out.format("Cadastro: %s", cadastro);

        NinjaRecord cadastro1 = new NinjaRecord("Naruto uzumaki", "naruto@arromba.com", 9999999);
        System.out.format("\nCadastro %s", cadastro1);
        System.out.println("\n" + cadastro1.emailCaixaAlta());
    }
}
