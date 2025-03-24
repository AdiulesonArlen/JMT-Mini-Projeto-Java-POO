public abstract class ProjetoSustentavel {
    private String nome;
    private String descricao;

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract void calcularImpacto();

    public abstract void exibirRelatorio();
}
