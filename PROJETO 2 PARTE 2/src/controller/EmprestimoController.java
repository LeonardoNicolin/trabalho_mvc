package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoController {

    private List<Emprestimo> lista = new ArrayList<>();

    public Emprestimo criarEmprestimo(int id, Aluno aluno, Livro livro) {
        Emprestimo e = new Emprestimo(id, aluno, livro);
        lista.add(e);
        return e;
    }

    public void devolverLivro(Emprestimo e) {
        e.devolver();
    }

    public List<Emprestimo> listar() {
        return lista;
    }
}