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
