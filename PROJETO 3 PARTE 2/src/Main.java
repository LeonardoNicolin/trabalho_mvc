import controller.PedidoController;
import model.*;
import view.PedidoView;

public class Main {

    public static void main(String[] args) {

        PedidoController controller = new PedidoController();
        PedidoView view = new PedidoView();

        Produto p1 = new Produto(1, "X-Burguer", "Hamburguer", 15);
        Produto p2 = new Produto(2, "Refrigerante", "Lata", 5);

        Pedido pedido = controller.criarPedido(1);

        controller.adicionarItem(pedido, p1, 2);
        controller.adicionarItem(pedido, p2, 1);

        controller.finalizarPedido(pedido);

        view.mostrarPedidos(controller.listar());
    }
}