public class itemCardapio {
    private String nome;
    private String descricao;
    private int itemID;
    private double preco;


    // O construtor agora recebe os valores como parâmetros
    public itemCardapio(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.itemID = CentralDeDados.getInstancia().gerarProximoItemID();
    }
}
