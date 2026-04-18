package view;

import model.Aluguel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AluguelView {

    public void mostrarAlugueisPorData(List<Aluguel> lista, Date dataConsulta) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\n===== ALUGUÉIS DO DIA " + sdf.format(dataConsulta) + " =====\n");

        for (Aluguel a : lista) {

            if (sdf.format(a.getData()).equals(sdf.format(dataConsulta))) {

                System.out.println("Cliente: " + a.getCliente().getNome());
                System.out.println("Telefone: " + a.getCliente().getTelefone());
                System.out.println("Total: R$ " + a.getTotal());
                System.out.println("-------------------------");
            }
        }
    }
}