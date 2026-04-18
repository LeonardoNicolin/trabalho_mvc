package model;

public class ItemPedido {

    private Produto produto;
    private int quantidade;
    private double subtotal;

    public ItemPedido(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = produto.getPreco() * quantidade;
    }

    public double getSubtotal() { return subtotal; }
    public Produto getProduto() { return produto; }
}