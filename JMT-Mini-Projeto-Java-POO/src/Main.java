public class Main {
    public static void main(String[] args) {
        // Criando organização (ONG e Empresa)
        Organizacao ong = new ONG("Eco Sustentável");
        Organizacao empresa = new Empresa("GreenTech", "12.345.678/0001-90");

        // Criando projetos
        ProjetoSustentavel projetoReflorestamento = new ProjetoReflorestamento("Reflorestamento Urbano", "Plantar árvores na cidade", 100);
        ProjetoSustentavel projetoReciclagem = new ProjetoReciclagem("Reciclagem Comunitária", "Coleta de resíduos recicláveis", 5.0);
        ProjetoSustentavel projetoEnergiaRenovavel = new ProjetoEnergiaRenovavel("Energia Solar", "Instalação de painéis solares", 50.0);

        // Exibindo informações das organizações
        System.out.println("Informações da Organização:");
        ong.exibirInformacoes();
        empresa.exibirInformacoes();

        // Exibindo relatórios dos projetos
        System.out.println("\nRelatórios dos Projetos Sustentáveis:");
        projetoReflorestamento.exibirRelatorio();
        System.out.println("");
        projetoReciclagem.exibirRelatorio();
        System.out.println("");
        projetoEnergiaRenovavel.exibirRelatorio();
        System.out.println("");
    }
}
