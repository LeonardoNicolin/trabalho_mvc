package model;

import java.util.Date;

public class Emprestimo {

    private int id;
    private Aluno aluno;
    private Livro livro;
    private Date data;
    private boolean devolvido;

    public Emprestimo(int id, Aluno aluno, Livro livro) {
        if (livro.getQuantidade() <= 0) {
            throw new IllegalArgumentException("Livro indisponível");
        }

        this.id = id;
        this.aluno = aluno;
        this.livro = livro;
        this.data = new Date();
        this.devolvido = false;

        livro.diminuir();
    }

    public void devolver() {
        if (!devolvido) {
            devolvido = true;
            livro.aumentar();
        }
    }

    public boolean isDevolvido() { return devolvido; }
    public Aluno getAluno() { return aluno; }
    public Livro getLivro() { return livro; }
}