package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class PedidoController {

    private List<Pedido> lista = new ArrayList<>();

    public Pedido criarPedido(int id) {
        Pedido p = new Pedido(id);
        lista.add(p);
        return p;
    }

    public void adicionarItem(Pedido pedido, Produto produto, int quantidade) {
        pedido.adicionarItem(new ItemPedido(produto, quantidade));
    }

    public void finalizarPedido(Pedido pedido) {
        pedido.finalizar();
    }

    public List<Pedido> listar() {
        return lista;
    }
}