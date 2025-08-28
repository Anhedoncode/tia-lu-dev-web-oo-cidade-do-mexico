import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedidos {

    private int numeroPedido;
    private Clientes cliente;
    private List<itemPedido> itensDoPedido;
    private statusPedido status;
    private LocalDateTime dataHora;

    public Pedidos(Clientes cliente, CentralDeDados centralDeDados) {
        this.cliente = cliente;
        this.itensDoPedido = new ArrayList<>();
        this.numeroPedido = centralDeDados.gerarProximoNumeroPedido();
        this.status = statusPedido.ACEITO;
        this.dataHora = LocalDateTime.now();
    }

    public void adicionarItem(itemCardapio item, int quantidade) {
        itemPedido novoItem = new itemPedido(item, quantidade);
        this.itensDoPedido.add(novoItem);
    }

    public void avancarStatusPedido() {
        switch (this.status) {
            case ACEITO:
                this.status = statusPedido.PREPARADO;
                break;
            case PREPARADO:
                this.status = statusPedido.FEITO;
                break;
            case FEITO:
                this.status = statusPedido.AGUARDANDO_ENTREGADOR;
                break;
            case SAIU_PARA_ENTREGA:
                this.status = statusPedido.ENTREGUE;
                break;
            default:
                System.out.println("Não é possível avançar o status deste pedido.");
                break;
        }
    }

    public statusPedido getStatus() {
        return this.status;
    }
}