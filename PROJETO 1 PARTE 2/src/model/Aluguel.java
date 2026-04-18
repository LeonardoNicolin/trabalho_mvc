package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluguel {

    private int id;
    private Cliente cliente;
    private Date data;
    private List<Horario> horarios;
    private double total;

    public Aluguel(int id, Cliente cliente, Date data) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.horarios = new ArrayList<>();
    }

    public void adicionarHorario(Horario h) {
        horarios.add(h);
        total += h.getValor();
    }

    public Cliente getCliente() { return cliente; }
    public Date getData() { return data; }
    public double getTotal() { return total; }
}