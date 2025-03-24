public class ONG extends Organizacao {
    
    public ONG(String nome) {
        super(nome);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("ONG: " + getNome());
    }
}
