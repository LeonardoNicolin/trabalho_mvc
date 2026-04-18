import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro(1, "Java Básico", "Autor A", 2);
        Livro l2 = new Livro(2, "POO Avançado", "Autor B", 1);

        Aluno a1 = new Aluno(1, "Carlos");
        Aluno a2 = new Aluno(2, "Ana");

        List<Emprestimo> lista = new ArrayList<>();

        Emprestimo e1 = new Emprestimo(a1, l1);
        Emprestimo e2 = new Emprestimo(a2, l2);

        lista.add(e1);
        lista.add(e2);

        e1.devolver();

        System.out.println("Livros:");
        for (Emprestimo e : lista) {
            if (e.emAberto()) {
                System.out.println(e.getLivro().getTitulo());
            }
        }

        System.out.println("\nAlunos com livros em aberto:");
        for (Emprestimo e : lista) {
            if (e.emAberto()) {
                System.out.println(e.getAluno().getNome());
            }
        }
    }
}