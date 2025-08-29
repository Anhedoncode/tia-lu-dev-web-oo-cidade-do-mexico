import java.util.Scanner;

public class Menu {

    private CentralDeDados central;
    private Scanner scanner;

    public Menu(CentralDeDados central) {
        this.central = central;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Item do Cardápio");
            System.out.println("3 - Fazer Pedido");
            System.out.println("4 - Listar Pedidos por Status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir ENTER

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarItemCardapio();
                    break;
                case 3:
                    fazerPedido();
                    break;
                case 4:
                    listarPedidos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void cadastrarCliente() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(central.gerarProximoItemID(), nome, telefone, endereco);
        central.adicionarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void cadastrarItemCardapio() {
        System.out.print("Nome do item: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        itemCardapio item = new itemCardapio(nome, descricao, preco, central);
        central.adicionarItemCardapio(item);
        System.out.println("Item do cardápio cadastrado!");
    }

    private void fazerPedido() {
        System.out.println("Funcionalidade de pedido ainda pode ser implementada...");
    }

    private void listarPedidos() {
        System.out.println("Funcionalidade de listar pedidos ainda pode ser implementada...");
    }
}

