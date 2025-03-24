public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void calcularImpacto() {
        // Aqui seria calculado o impacto baseado na energia gerada
        System.out.println("Impacto do Projeto de Energia Renovável: " + energiaGerada + " MWh de energia gerada.");
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório do Projeto de Energia Renovável: " + getNome() + "\n" +
                           "Descrição: " + getDescricao() + "\n" +
                           "Energia Gerada: " + energiaGerada + " MWh");
    }
}
