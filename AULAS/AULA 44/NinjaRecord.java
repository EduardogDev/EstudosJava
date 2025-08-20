import java.util.Locale;

public record NinjaRecord(String nome, String email, int telefone) {

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }
}
