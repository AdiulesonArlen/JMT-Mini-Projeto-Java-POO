public class RelatorioImpacto {
    private int arvoresPlantadas; // Quantidade de árvores plantadas pelo projeto
    private double reducaoCO2; // Redução de CO2 em toneladas gerada pelo projeto
    
    // Construtor que inicializa o relatório com a quantidade de árvores plantadas e a redução de CO2
    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
    }

    // Método para exibir o relatório de impacto ambiental
    public void exibirRelatorio() {
        System.out.println("===== Relatório de Impacto =====");
        System.out.println("Árvores Plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCO2 + " toneladas");
    }
    

    
}
