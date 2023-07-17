

# Atividade Cardápio com ArrayList

Atividade proposta pelo curso Especialista Java da AlgaWorks com objetivo de fixar os conteúdos apresentado no modulo de arrays. Desta vez refatorando o código e utilizando Polimorfismo e classes abstratas.



## Tecnologias

- Java

## Tarefa de cada classe

A atividade é composta por 8 classes, sendo elas: EmpresaLucroReal, EmpresaLucroSimples, Pessoa, PessoaFisica, PessoaJurica, GestorDeImposto e a classe Principal1 e Principal2.

Pessoa: recebe os atributos:
* Nome = String nome
E um método abstrato calcularImposto com retorno double com função de calcular o imposto de renda

PessoaFisica extend a classe Pessoa recebendo seus atributos e métodos, além desses atributos ele tem tambem:
* receita anual de insenção = double RECEITA_ANUAL_ISENCAO
* aliquota imposto de renda = double ALIQUOTA_IMPOSTO_RENDA
E o método calcularImposto da classe Pessoa, com a regra de, se caso a receita anual for menor que RECEITA_ANUAL_ISENCAO(50000), é insento de impostos, caso contrario é calculado o imposto

CarPessoaJuridicadapio extend a classe Pessoa recebendo seus atributos e métodos, além desses atributos ele tem tambem:
* faturamento anual = double faturamentoAnual; 
* despesas anuais = double despesaAnual
E o método getLucroAnual que retona um valor double, o método tem a função de calcular o lucro anual, faturamento - despesaAnual

EmpresaLucroSimples extend a classe PessoaJurica recebendo seus atributos e métodos, além desses atributos ele tem tambem:
* aliquota imposto de faturamento = double ALIQUOTA_IMPOSTO_FATURAMENTO
E o método calcular imposto que retona um valor double, o método tem a função de calcular o faturamentoAnual * ALIQUOTA_IMPOSTO_FATURAMENTO

EmpresaLucroReal extend a classe PessoaJurica recebendo seus atributos e métodos, além desses atributos ele tem tambem:
* aliquota imposto sobre lucro = double ALIQUOTA_IMPOSTO_LUCRO
E o método calcularImposto que retona um valor double, o método tem a função de calcular o getLucroAnual * ALIQUOTA_IMPOSTO_LUCRO

GestorDeImposto tem os atributos:
* valor total de impostos = double valorTotalImpostos
E um método adicionarPessoa, com a função de adicionar pessoas e calcular o total de imposto

A classe Principal1 recebe as estansia da Classe PessoaFisica

A classe Principal2 recebe as estansia das classes PessoaFisica, EmpresaLucroSimples, EmpresaLucroReal e a Classe GestorDeImposto


