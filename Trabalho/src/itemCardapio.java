public class itemCardapio {

    private String nome;
    private String descricao;
    private int itemID;
    private double preco;

    public itemCardapio(String nome, String descricao, double preco, CentralDeDados centralDeDados) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.itemID = centralDeDados.gerarProximoItemID();
    };

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getItemID() {
        return this.itemID;
    }

    @Override
    public String toString() {
        return "itemCardapio{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", itemID=" + itemID +
                ", preco=" + preco +
                '}';
    }
}
