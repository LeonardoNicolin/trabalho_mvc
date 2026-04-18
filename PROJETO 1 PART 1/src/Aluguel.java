import java.util.ArrayList;
import java.util.List;

public class Aluguel {

    private Cliente cliente;
    private List<Horario> horarios;
    private String data;
    private double valorTotal;

    public Aluguel(Cliente cliente, String data) {
        this.cliente = cliente;
        this.data = data;
        this.horarios = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarHorario(Horario h) {
        if (!h.isDisponivel()) {
            throw new IllegalStateException("Horário já ocupado");
        }

        h.reservar();
        horarios.add(h);
        valorTotal += h.getValor();
    }

    public String getData() {
        return data;
    }

    public void mostrar() {
        System.out.println("\n--- ALUGUEL ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + data);

        System.out.println("Horários:");
        for (Horario h : horarios) {
            System.out.println("- " + h.getHora());
        }

        System.out.println("Total: R$ " + valorTotal);
    }
}