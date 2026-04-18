package model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(int id, String titulo, String autor, int quantidade) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título vazio");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void diminuir() {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Sem estoque");
        }
        quantidade--;
    }

    public void aumentar() {
        quantidade++;
    }
}