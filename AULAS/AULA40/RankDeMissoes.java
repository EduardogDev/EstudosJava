package NivelIntermediario;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Confortavel", 3),
    B("Moderado",4),
    A("Dificil", 5),
    S("Profissional", 6);

    private String descricao;
    private int dificuldade;
    //OBRIGO ELE A PASSAR AS INFORMAÇÕES
    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }


}
