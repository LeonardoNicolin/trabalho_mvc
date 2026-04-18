package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private int id;
    private Date data;
    private List<ItemPedido> itens;
    private double total;

    public Pedido(int id) {
        this.id = id;
        this.data = new Date();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0;
        for (ItemPedido i : itens) {
            total += i.getSubtotal();
        }
    }

    public void finalizar() {
        if (itens.isEmpty()) {
            throw new IllegalArgumentException("Pedido vazio");
        }
    }

    public double getTotal() { return total; }
    public Date getData() { return data; }
    public List<ItemPedido> getItens() { return itens; }
}