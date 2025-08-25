import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


public class Pedidos {
    private int numeroPedido;
    private Clientes cliente;
    private List<itemPedido> itensDoPedido;
    private statusPedido status;
    private LocalDateTime dataHora;


    // Construtor ->


    public Pedidos(Clientes cliente){
        this.cliente = cliente;
        this.itensDoPedido = new ArrayList<>();
        this.numeroPedido = CentralDeDados.getInstancia().gerarProximoNumeroPedido();


        this.status = statusPedido.ACEITO;
        this.dataHora = LocalDateTime.now();
    }


    // Métodos


    /* Método de adicionar um item */
    public void adicionarItem(itemCardapio item, int quantidade) {


        // Cria um novo ItemPedido com o objeto ItemCardapio e a quantidade
        itemPedido novoItem = new itemPedido(item, quantidade);


        // Adiciona o novo item à lista de itens do pedido
        this.itensDoPedido.add(novoItem);
    }


}
