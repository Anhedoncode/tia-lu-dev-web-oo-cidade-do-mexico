import java.util.ArrayList;
import java.util.List;

public class CentralDeDados {

    private List<Clientes> clientes;
    private List<itemCardapio> itensCardapio;
    private List<Pedidos> pedidos;

    private int contadorCliente = 0;
    private int contadorItem = 0;
    private int contadorPedido = 0;

    public CentralDeDados() {
        this.clientes = new ArrayList<>();
        this.itensCardapio = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public int gerarProximoItemID() {
        this.contadorItem++;
        return this.contadorItem;
    }

    public int gerarProximoNumeroPedido() {
        this.contadorPedido++;
        return this.contadorPedido;
    }

    public void adicionarCliente(Clientes cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarItemCardapio(itemCardapio item) {
        this.itensCardapio.add(item);
    }

    public void adicionarPedido(Pedidos pedido) {
        this.pedidos.add(pedido);
    }

    public List<Pedidos> listarPedidosPorStatus(statusPedido status) {
        List<Pedidos> pedidosFiltrados = new ArrayList<>();
        for (Pedidos pedido : this.pedidos) {
            if (pedido.getStatus() == status) {
                pedidosFiltrados.add(pedido);
            }
        }
        return pedidosFiltrados;
    }
}