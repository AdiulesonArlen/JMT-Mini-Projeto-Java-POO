public class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas) {
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void calcularImpacto() {
        // Aqui seria calculado o impacto baseado em árvores plantadas, por exemplo
        System.out.println("Impacto do Projeto Reflorestamento: " + arvoresPlantadas + " árvores plantadas.");
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório do Projeto de Reflorestamento: " + getNome() + "\n" +
                           "Descrição: " + getDescricao() + "\n" +
                           "Árvores Plantadas: " + arvoresPlantadas);
    }
}
