public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(int id, String titulo, String autor, int quantidade) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void diminuirQuantidade() {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Livro sem estoque");
        }
        quantidade--;
    }

    public void aumentarQuantidade() {
        quantidade++;
    }

    public String getTitulo() {
        return titulo;
    }
}