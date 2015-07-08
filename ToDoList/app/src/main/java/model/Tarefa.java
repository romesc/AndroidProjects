package model;

public class Tarefa {

    private Integer _id;
    private String tarefa;
    private String dt_criacao;
    private String dt_conclusao;

    public Tarefa() {}

    public Tarefa(Integer id, String tarefa, String dtcriacao, String dtconclusao) {
        this._id = id;
        this.tarefa = tarefa;
        this.dt_criacao = dtcriacao;
        this.dt_conclusao = dtconclusao;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDt_criacao() {
        return dt_criacao;
    }

    public void setDt_criacao(String dt_criacao) {
        this.dt_criacao = dt_criacao;
    }

    public String getDt_conclusao() {
        return dt_conclusao;
    }

    public void setDt_conclusao(String dt_conclusao) {
        this.dt_conclusao = dt_conclusao;
    }
}
