import java.util.ArrayList;
import java.util.List;

public class Organizacao {
    // Atributos:
    private String nome; // Nome da organização
    private List<ProjetoSustentavel> listaProjetos; // Lista de projetos sustentáveis

    // Construtor que inicaliza a organiação com um nome e uma lista vazia de projetos.
    public Organizacao(String nome) {
        this.nome = nome;
        this.listaProjetos = new ArrayList<>();
    }

    // Método para adicionar um novo projeto à lista de projetos da organização
    public void adicionarProjeto(ProjetoSustentavel projeto) {
        listaProjetos.add(projeto);
    }

    // Método para listar todos os projetos da oragnização
    public void listarProjetos() {
        System.out.println("Projetos da organização " + nome + ":");
        for (ProjetoSustentavel projeto : listaProjetos) {
            System.out.println("- " + projeto.getNome());
        }
    }

    // Getter para obter o nome da organização
    public String getNome() {
        return nome;
    }
}
