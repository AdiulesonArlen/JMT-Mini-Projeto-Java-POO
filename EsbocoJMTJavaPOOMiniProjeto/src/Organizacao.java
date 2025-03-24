import java.util.ArrayList;

public class Organizacao {
    // Declaração de Variáveis:
    private String nome;
    private ArrayList<String> listaDeProjetos = new ArrayList<>();

    // Construtor da classe:
    public Organizacao() {

    }

    public Organizacao(String nome, ArrayList<String> listaDeProjetos) {
        this.nome = nome;
        this.listaDeProjetos = listaDeProjetos;
    }

    // Métodos da classe:
    public void adicionarProjetos(String nome, String descricao) {
        listaDeProjetos.add(nome);
    }
    public void listarProjetos() {

    }


}
