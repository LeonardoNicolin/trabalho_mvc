package view;

import model.Pedido;
import model.ItemPedido;

import java.util.List;

public class PedidoView {

    public void mostrarPedidos(List<Pedido> lista) {

        double faturamento = 0;

        System.out.println("Pedidos:");

        for (Pedido p : lista) {

            System.out.println("Data: " + p.getData());

            for (ItemPedido i : p.getItens()) {
                System.out.println("- " + i.getProduto().getNome() +
                        " | Subtotal: " + i.getSubtotal());
            }

            System.out.println("Total: " + p.getTotal());
            System.out.println("-------------------");

            faturamento += p.getTotal();
        }

        System.out.println("Faturamento total: " + faturamento);
    }
}