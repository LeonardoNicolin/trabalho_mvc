import controller.AluguelController;
import model.*;
import view.AluguelView;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        AluguelController controller = new AluguelController();
        AluguelView view = new AluguelView();

        Cliente cliente = new Cliente(1, "Carlos", "4499977-2025");

        Horario h1 = new Horario(1, "18:00", "19:00", 50);
        Horario h2 = new Horario(2, "19:00", "20:00", 60);

        Date data = new Date();

        Aluguel aluguel = controller.criarAluguel(1, cliente, data);

        controller.adicionarHorario(aluguel, h1);
        controller.adicionarHorario(aluguel, h2);

        view.mostrarAlugueisPorData(controller.listarAlugueis(), data);
    }
}