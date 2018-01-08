# Lecture 2

---

# Teste Funcional

### Introdução

- Pode ser aplicado em qualquer unidade, mas quanto menor, mais fácil
- Especificação funcional: uma descrição do comportamento esperado
	- Queremos também saber o comportamento **não esperado** (geralmente com domínio inválido)
- Teste funcional = Teste caixa-preta = Teste baseado em especificação
- **Não tem como checar requisitos não funcionais**.
- Muitas empresas se satisfazem apenas com testes funcionais. **Imediatismo**.
- Um grande problema é que não se sabe a taxa de erro do processo de desenvolvimento das empresas.
- A qualidade do código é fundamental para o trabalho em equipe.

### Particionamento

- Casos de testes são alocados em classes geradas com base nas especificações
- Todos os elementos da classe possuem a mesma capacidade para identificar um defeito
- Reduz o tamanho do D(P)
- Permite indentificar singularidades (valores especiais e valores limites)
- Quem já ouviu falar do [MC/DC](https://en.wikipedia.org/wiki/Modified_condition/decision_coverage)? Teste funcional de sistema é algo muito complexo.

### Particionamento vs Geração Aleatória

- Particionamento
	- Custo alto para identificar partições
	- pode ser automatizado
	- critério de seleção de elementos mais eficiente utilizando tecnicas de amostragem
	- não sobreposição de elementos
- Geração aleatória
	- smoke test
	- baixo custo
	- gera muitos casos de teste
	- sensível a conjunto de casos de teste não homogêneos
	- **Não consegue checar singularidade!**

### Exercício particionamento:
- Suponha P um programa que identifica se um triângulo é isosceles, equilátero ou escaleno.

1. Questão:
	a. A geração aleatória de casos de teste é eficiente para testar este programa? Justifique.
		- **Res:** O exercício de caso de escaleno facilmente apareceria. A funcionalidade de triângulo isósceles seria mais rara e a de equilátero seria mais rara ainda. As singularidades teriam de ser inseridas manualmente.

### Abordagem sistemática
- Identificar as especificações funcionais
	- documentação
	- manuais
- Identificar funcionabilidades de teste independentes
	- cada funcionabilidade possui uma classe que a testa
	- menos custosa que tentar identificar um elemento que teste várias funcionabilidades
- Identificar classe de valores representativos ou derivar um modelo
	- Identificar a classe de valores consistem em enumerar os possíveis valores de entrada que pertencem a classe (valores limites, singularidades, etc.)
	- baixo custo
	- técnica simples baseada na leitura direta da especificação (custo alto de homens-hora)
- Derivar um modelo consiste em modelar a especificação e com base na modelagem derivar os casos de teste
	- Alto custo devido a construção do modelo
	- Especificação descrita na forma de uma máquina de estados finitos
- Gerar especificações de casos de teste
	- combinar os valores de entrada de uma dada especificação funcional
	- identificar combinações singulares, inválidas e repetidas
- Gerar casos de teste e instanciar os testes
	- um ou mais elementos de D(P) são selecionados com base na especificação dos casos de teste válidas

### Vantagens do teste funcional
- Pode e deve ser usado em qualquer etapa do desenvolvimento
- Indiferente a detalhes de implementação
	- linguagem
	- habilidade do programador
	- estrutura de código
	- ambiente de execução
- Pode ser automatizado (especificação formal ex. Z)
- Auxilia na compreensão das próprias especificações aumentand oo conhecimento do sistema

### Desvantagens
- Qualidade do teste depende da qualidade da especificação
	- especificação são sujeitas a erros
	- especificações são feitas, geralmente, em linguagem natural

- Particionamento é uma tarefa difícil e exige
	- alta capacitação
	- muita experiência
- Linguagens formais para especificação são complexas e exigem capacitação

### Exercício
- Dada a especificação:

Um software realiza operações de +,-,* e / e sobre inteiros e reais. Os operandos devem ser do mesm otipo. Operações sobre inteiros resultam em inteiros sobre reais. A aplicação possui uma interface gráfica com 16 dígitos: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, +, -, *, /, C(clear) e =. As operações são sempre do tipo (operando1 operador operando2 =).
A aplicação retorna "Error" quando ocorre um erro de operação.

1. Identifique as unidades testáveis independentemente.
**Resposta**:
	- Testar a interface: Criar uma cadeia de 16 dígitos e verificar se chega até 16 ou passa de 16.
	- A adição, subtração, multiplicação e divisão (nenhuma é independente da operação =)

2. Gere um conjunto de caso de testes baseado na especificação.(Entregar)

**Resposta**:
{<(1,+,2,=),3>;      <(2,-,1,=),1>;     <(2,*,2,=),4>;
 <(4,/,2,=),2>;      <(5,/,2,=), inv.>; <(1,=,1,=),1>;
 <(1,+,1.5,=), inv>; <(1,*,2.5,=),inv:; <(3.5,-,2,=),inv>;
} 

3. Identifique valores limites e singularidades.
**Resposta**:
Divisão por 0, 

Baseado em Young e Pezzé

	
### Teste Estrutural

- A definição dos critérios de teste se dá com base na estrutura da implementação.
- Critério de parada bem definido.
- Conhecimento do código: As classes utilizadas para o teste foram as esperadas?
- Detecção de código frio (código que nunca é executado, ou muito pouco, pode indicar malware!)
- Também denominado de teste caixa-branca (white-box)

