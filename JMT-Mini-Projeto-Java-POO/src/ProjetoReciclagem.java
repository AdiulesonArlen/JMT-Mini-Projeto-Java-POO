public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas) {
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void calcularImpacto() {
        // Aqui seria calculado o impacto baseado em toneladas recicladas
        System.out.println("Impacto do Projeto de Reciclagem: " + toneladasRecicladas + " toneladas recicladas.");
    }

    @Override
    public void exibirRelatorio() {
        System.out.println("Relatório do Projeto de Reciclagem: " + getNome() + "\n" +
                           "Descrição: " + getDescricao() + "\n" +
                           "Toneladas Recicladas: " + toneladasRecicladas);
    }
}
