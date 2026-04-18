Tabelas (Classes)

Livro
- id
- título
- autor
- quantidade

Aluno
- id
- nome

Emprestimo
- aluno
- livro
- dataEmprestimo
- dataDevolucao

Regras de Negócio

- Não permitir cadastrar livro com título vazio
- Não permitir cadastrar livro com quantidade negativa
- Não permitir emprestar livro sem quantidade disponível
- Ao realizar empréstimo, a quantidade do livro deve diminuir
- Ao devolver livro, a quantidade deve aumentar
- Não permitir devolver um livro que já foi devolvido
- Permitir registrar empréstimos e devoluções
- Permitir consultar livros que estão emprestados
- Permitir consultar alunos com empréstimos em aberto