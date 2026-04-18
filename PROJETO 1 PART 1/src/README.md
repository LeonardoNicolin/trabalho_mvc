Tabelas (Classes)

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