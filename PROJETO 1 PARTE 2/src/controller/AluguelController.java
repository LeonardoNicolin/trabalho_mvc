package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AluguelController {

    private List<Aluguel> alugueis = new ArrayList<>();

    public Aluguel criarAluguel(int id, Cliente cliente, Date data) {
        Aluguel aluguel = new Aluguel(id, cliente, data);
        alugueis.add(aluguel);
        return aluguel;
    }

    public void adicionarHorario(Aluguel aluguel, Horario horario) {
        if (horario.isOcupado()) {
            throw new IllegalArgumentException("Horário já ocupado");
        }

        horario.ocupar();
        aluguel.adicionarHorario(horario);
    }

    public List<Aluguel> listarAlugueis() {
        return alugueis;
    }
}