package model;

public class Aluno {

    private int id;
    private String nome;

    public Aluno(int id, String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}