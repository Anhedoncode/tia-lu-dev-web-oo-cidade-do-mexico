public class itemCardapio {

    private String nome;
    private String descricao;
    private int itemID;
    private double preco;

    public itemCardapio(String nome, String descricao, double preco, CentralDeDados centralDeDados) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.itemID = centralDeDados.gerarProdutoItemID();
    }
}