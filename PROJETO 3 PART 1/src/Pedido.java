import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos;
    private String data;
    private double total;

    public Pedido(String data) {
        this.data = data;
        this.produtos = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        total += p.getPreco();
    }

    public void finalizar() {
        if (produtos.isEmpty()) {
            throw new IllegalArgumentException("Pedido vazio");
        }
    }

    public String getData() {
        return data;
    }

    public double getTotal() {
        return total;
    }

    public void mostrar() {
        System.out.println("Pedido - " + data);

        for (Produto p : produtos) {
            System.out.println(p.getNome());
        }

        System.out.println("Total: " + total + "\n");
    }
}