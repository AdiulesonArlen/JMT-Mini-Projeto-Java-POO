import java.util.ArrayList;
import java.util.List;

public class ProjetoSustentavel {
    private String nome; // Nome do projeto
    private String descricao; // Descrição do projeto
    private List<Voluntario> voluntarios; // Lista de vonluntários que participam do projeto
    private RelatorioImpacto relatorioImpacto; // Relatório de impacto ambiental do projeto

    // Construtor que inicializa o projeto com nome e descrição
    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
        this.relatorioImpacto = null; // O relatório de impacto é criado posteriormente
    }

    // Método para adicionar um voluntário ao projeto
    public void adicionarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }
    
    // Método para gerar um relatório de impacto para o projeto
    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
    }

    // Getter para obter o nome do projeto
    public String getNome() {
        return nome;
    }
}
