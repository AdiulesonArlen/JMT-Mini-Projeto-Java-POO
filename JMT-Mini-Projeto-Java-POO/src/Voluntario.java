public class Voluntario {
    private String nome; // Nome do volutário
    private String email; // E-mail do volutário
    
    // Construtor que inicializa o voluntário com nome e e-mail
    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    // Método para associar o voluntário a um projeto sustentável
    public void participaProjeto(ProjetoSustentavel projeto) {
        projeto.adicionarVoluntario(this);
    }

}
