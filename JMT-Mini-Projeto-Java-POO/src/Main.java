public class Main {
    public static void main(String[] args) throws Exception {
        // Criando uma organização
        Organizacao organizacao = new Organizacao("Eco Sustentável");

        // Criando um projeto sustentável
        ProjetoSustentavel projeto01 = new ProjetoSustentavel("Reflorestamento Urbano", "Plantar árvores na cidade para reduzir CO2.");

        // Criando voluntários
        Voluntario voluntario01 = new Voluntario("Adam Vinícius", "adamvinicius@email.com");
        Voluntario voluntario02 = new Voluntario("Arthur Kennedy", "arthurkennedy@email.com");
        Voluntario voluntario03 = new Voluntario("Anthony Austin", "anthonyaustin@email.com");

        // Adicionando voluntários ao projeto
        projeto01.adicionarVoluntario(voluntario01);
        projeto01.adicionarVoluntario(voluntario02);
        projeto01.adicionarVoluntario(voluntario03);

        // Gerando um relatório de impacto para o projeto
        projeto01.gerarRelatorioImpacto(500, 2.5);

        // Adicionando o projeto à organização
        organizacao.adicionarProjeto(projeto01);

        // Listando os projetos da organização
        System.out.println("Projetos da Organização:");
        organizacao.listarProjetos();

        // Exibindo o relatório de impacto do projeto
        System.out.println("\nRelatório de Impacto do Projeto:");
        projeto01.gerarRelatorioImpacto(500, 2.5);
    }
}
