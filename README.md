# trabalho_mvc

Tabelas (Classes) - EXERCÍCIO 1

Cliente
- nome
- telefone

Horario
- hora
- valor
- disponível

Aluguel
- cliente
- lista de horários
- data
- valorTotal

Regras de Negócio

- Não permitir cadastrar cliente com nome vazio
- Não permitir cadastrar horário com valor negativo
- Não permitir reservar um horário já ocupado
- Permitir adicionar mais de um horário no mesmo aluguel
- Calcular automaticamente o valor total do aluguel
- Permitir consultar os aluguéis por data





-------------------------------------------------------------

Tabelas (Classes) - EXERCÍCIO 2

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

-------------------------------------------------------------

Tabelas (Classes) - EXERCÍCIO 3

Produto
- nome
- descrição
- preço

Pedido
- lista de produtos
- data
- total

Regras de Negócio

- Não permitir cadastrar produto com nome vazio
- Não permitir cadastrar produto com preço negativo
- Permitir adicionar mais de um produto no mesmo pedido
- Calcular automaticamente o valor total do pedido
- Não permitir finalizar pedido sem produtos
- Permitir consultar pedidos por data
- Permitir calcular o total faturado em um período
