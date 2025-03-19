import java.util.ArrayList;
import java.util.HashMap;

public class ProjetoSustentavel {
    // Atributos da Classe:
    private String nome;
    private String descricao;
    private ArrayList<Voluntario> listaDeVoluntarios = new ArrayList<>();
    private ArrayList<RelatorioImpacto> relatorioDeImpacto = new ArrayList<>();

    // Construtores da classe:
    public ProjetoSustentavel() {

    }

    public ProjetoSustentavel(String nome, String descricao, ArrayList<Voluntario> listaDeVoluntarios, ArrayList<RelatorioImpacto> relatorioDeImpacto) {
        this.nome = nome;
        this.descricao = descricao;
        this.listaDeVoluntarios = listaDeVoluntarios;
        this.relatorioDeImpacto = relatorioDeImpacto;
    }

    // Métodos da Classe:
    public void adicionarVoluntario(){

    }

    public void gerarRelatorioDeImpacto(){

    }

}
