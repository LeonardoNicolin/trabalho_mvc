package view;

import model.Emprestimo;

import java.util.List;

public class EmprestimoView {

    public void mostrarEmprestimos(List<Emprestimo> lista) {

        System.out.println("\n=== EMPRÉSTIMOS EM ABERTO ===\n");

        for (Emprestimo e : lista) {
            if (!e.isDevolvido()) {
                System.out.println("Aluno: " + e.getAluno().getNome());
                System.out.println("Livro: " + e.getLivro().getTitulo());
                System.out.println("-------------------");
            }
        }
    }
}