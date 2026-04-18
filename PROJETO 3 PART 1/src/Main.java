import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pedido> lista = new ArrayList<>();

        Produto p1 = new Produto("X-Burguer", "Lanche", 15);
        Produto p2 = new Produto("Refrigerante", "Bebida", 5);
        Produto p3 = new Produto("Batata", "Porção", 10);

        Pedido ped1 = new Pedido("16/04");
        ped1.adicionarProduto(p1);
        ped1.adicionarProduto(p2);
        ped1.finalizar();

        Pedido ped2 = new Pedido("17/04");
        ped2.adicionarProduto(p3);
        ped2.finalizar();

        lista.add(ped1);
        lista.add(ped2);

        for (Pedido p : lista) {
            p.mostrar();
        }

        System.out.println("Pedidos do dia 16/04:");
        for (Pedido p : lista) {
            if (p.getData().equals("16/04")) {
                p.mostrar();
            }
        }

        double total = 0;
        for (Pedido p : lista) {
            total += p.getTotal();
        }
        System.out.println("Total faturado: " + total);

    }
}