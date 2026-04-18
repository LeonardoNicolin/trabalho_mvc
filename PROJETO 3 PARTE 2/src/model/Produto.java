package model;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(int id, String nome, String descricao, double preco) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome vazio");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}