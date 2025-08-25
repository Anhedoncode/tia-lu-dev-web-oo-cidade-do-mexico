import java.util.ArrayList;
import java.util.List;


public class CentralDeDados {


    // a ideia da central de dados é armazenar a regra de negócio do sistema
    private static CentralDeDados instancia;


    private List<Clientes> clientes;
    private List<Pedidos> pedidos;
    private List<itemCardapio> itemCardapio;


    private int contadorCliente = 0;
    private int contadorItem = 0;
    private int contadorPedido;


    private CentralDeDados(){


        this.clientes = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.itemCardapio = new ArrayList<>();
    }


    public static CentralDeDados getInstancia(){
        if (instancia == null){
            instancia = new CentralDeDados();
        }


        return instancia;
    }


    public int gerarProximoNumeroPedido(){
        this.contadorPedido++;
        return contadorPedido;
    }


    public int gerarProximoItemID(){
        this.contadorItem++;
        return contadorItem;
    }
}
