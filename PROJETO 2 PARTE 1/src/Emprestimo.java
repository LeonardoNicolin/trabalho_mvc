import java.util.Date;

public class Emprestimo {

    private Aluno aluno;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Aluno aluno, Livro livro) {
        if (livro.getQuantidade() <= 0) {
            throw new IllegalArgumentException("Livro indisponível");
        }

        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = new Date();
        this.dataDevolucao = null;

        livro.diminuirQuantidade();
    }

    public void devolver() {
        if (dataDevolucao != null) {
            throw new IllegalArgumentException("Livro já devolvido");
        }

        dataDevolucao = new Date();
        livro.aumentarQuantidade();
    }

    public boolean emAberto() {
        return dataDevolucao == null;
    }

    public Livro getLivro() {
        return livro;
    }

    public Aluno getAluno() {
        return aluno;
    }
}