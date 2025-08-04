public class Task {
    private String nomeDaTarefa;
    private String descricaoDaAtividade;
    private TipoDePrioridades prioridade;
    private StatusDaAtividade status;



    public Task() {
    }

    public Task(String nomeDatarefa, String descricaoDaAtividade, TipoDePrioridades prioridades, StatusDaAtividade status) {
        this.nomeDaTarefa = nomeDatarefa;
        this.descricaoDaAtividade = descricaoDaAtividade;
        this.prioridade = prioridades;
        this.status = status;
    }

    public String getNomeDatarefa() {
        return descricaoDaAtividade;
    }

    public void setNomeDatarefa(String nomeDatarefa) {
        this.descricaoDaAtividade = descricaoDaAtividade;
    }

    public String getDescricaoDaAtividade() {
        return descricaoDaAtividade;
    }

    public void setDescricaoDaAtividade(String descricaoDaAtividade) {
        descricaoDaAtividade = descricaoDaAtividade;
    }

    public TipoDePrioridades getPrioridades() {
        return prioridade;
    }

    public void setPrioridades(TipoDePrioridades prioridades) {
        this.prioridade = prioridades;
    }

    public StatusDaAtividade getStatus() {
        return status;
    }

    public void setStatus(StatusDaAtividade status) {
        this.status = status;
    }

}
