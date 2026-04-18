import controller.EmprestimoController;
import model.*;
import view.EmprestimoView;

public class Main {

    public static void main(String[] args) {

        EmprestimoController controller = new EmprestimoController();
        EmprestimoView view = new EmprestimoView();

        Livro livro1 = new Livro(1, "Java", "Autor A", 2);
        Livro livro2 = new Livro(2, "POO", "Autor B", 1);

        Aluno aluno1 = new Aluno(1, "Carlos");
        Aluno aluno2 = new Aluno(2, "Ana");

        Emprestimo e1 = controller.criarEmprestimo(1, aluno1, livro1);
        Emprestimo e2 = controller.criarEmprestimo(2, aluno2, livro2);

        controller.devolverLivro(e1);

        view.mostrarEmprestimos(controller.listar());
    }
}