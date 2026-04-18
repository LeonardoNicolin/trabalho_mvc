import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluguel> lista = new ArrayList<>();

        Cliente c1 = new Cliente("João", "9999-9999");
        Cliente c2 = new Cliente("Maria", "8888-8888");

        Horario h1 = new Horario("18:00", 100);
        Horario h2 = new Horario("19:00", 100);
        Horario h3 = new Horario("20:00", 120);

        Aluguel a1 = new Aluguel(c1, "16/04");
        a1.adicionarHorario(h1);
        a1.adicionarHorario(h2);

        Aluguel a2 = new Aluguel(c2, "17/04");
        a2.adicionarHorario(h3);

        lista.add(a1);
        lista.add(a2);

        for (Aluguel a : lista) {
            a.mostrar();
        }

        System.out.println("\nAlugueis do dia 16/04:");
        for (Aluguel a : lista) {
            if (a.getData().equals("16/04")) {
                a.mostrar();
            }
        }
    }
}