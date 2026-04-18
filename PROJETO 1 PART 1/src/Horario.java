public class Horario {

    private String hora;
    private double valor;
    private boolean disponivel;

    public Horario(String hora, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.hora = hora;
        this.valor = valor;
        this.disponivel = true;
    }

    public String getHora() {
        return hora;
    }

    public double getValor() {
        return valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        if (!disponivel) {
            throw new IllegalStateException("Horário já ocupado");
        }
        disponivel = false;
    }
}