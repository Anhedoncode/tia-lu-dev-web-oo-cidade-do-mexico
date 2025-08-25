public class itemPedido {


    private int quantidade;
    private itemCardapio item;


    public itemPedido(itemCardapio item, int quantidade){ // Mudança aqui!
        this.item = item;
        this.quantidade = quantidade;
    }


    public int getQuantidade() {
        return this.quantidade;
    }
}
