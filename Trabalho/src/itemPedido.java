public class itemPedido {

    private int quantidade;
    private itemCardapio item;

    public itemPedido(itemCardapio item, int quantidade){
        this.item = item;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public itemCardapio getItem() {
        return this.item;
    }
}