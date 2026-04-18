package model;

public class Horario {

    private int id;
    private String inicio;
    private String fim;
    private double valor;
    private boolean ocupado;

    public Horario(int id, String inicio, String fim, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }

        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.valor = valor;
        this.ocupado = false;
    }

    public boolean isOcupado() { return ocupado; }
    public void ocupar() { this.ocupado = true; }

    public double getValor() { return valor; }
    public String getInicio() { return inicio; }
    public String getFim() { return fim; }
}