# Software Testing in Java
Notes and code used in the course ministered in the IME-USP
ime.usp.br/verao/
Be aware that these are the raw notes taken by me during the lectures and include my subjective criteria on what was worth writing down.

# Aula #1

### Teoria:
- Testes são 30 a 60% do custo do projeto de sw
- Garantia de que sw tem qualidade. Atende necessidades do cliente.

- Testar sw é como pescar falhas.
- Não é uma atividade passiva. Precisamos 'quebrar' o sw.
- Nunca é possível detectar todas as falhas. Apenas reduzimos ao maximo a chance de tais falhas surgirem quando o cliente estiver utilizando.
- É muito importante determinar a *causa raiz* do defeito e consertar o *processo*.
	- Isso pode produzir desconforto na organização.

- O tester precisa se comunicar com pessoal de requisito, desenvolvimento e negócios.

### Analogia da pescaria:
- *Pegar o defeito* vs *Pegar o peixe*
- *Preparar os casos de teste* vs *Preparar isca e vara*
- *Escolher o momento p tester* vs *Escolher o momento p pescar*
- *Escolher o local p tester* vs *Escolher o local p pescar*
- *Testar* vs *Pescar*

### What if we don't catch the fish?
- *Therac-25*: A silly sw defect killed a few people taking medical exams.
- *Ariane rocket*: Mistake on converting floats to integers.
- *NASA MCO satellite*: Mistake converting imperial to international measurement units.
- TODO: Insert link for list of sw bugs.

If the defect reaches the client, the company loses reputation. Gives the client leverage when negotiating.

### Origin of defects:
- Defects are often caused by people when communicating requirements.
- Insufficient skill from developers. 

### Software testing:
- Dynamic activity that seeks determining whether the sw behavior follows specification.

### Most common terms:
- Error (mistake, human action. may or may not produce a defect)
- Defect or Fault (deviation from requirements)
- Failure (inability of the sw to perform its required functions within requirements)

TODO: Translate this

- Domínio de Entrada
	- Domínio válido e inválido: Passar valores não permitidos na entrada da aplicação
	- Ataques hackers muitas vezes buscam entradas de domínio inválido
	- Domínio inválido nunca é especificado!
	- Teste de comportamento excepcional (ninguem faz isso!)
- Dado de Teste
	- Entrada do programa.
- Caso de Teste
	- Teste = < x, y, z>, x pertence ao dom. de entrada, y é o valor esperado e z é o valor observado.
	- Se y = z, teste passa. Se y != z, teste falha
	- Quem é y? Documentação!
- Malha de Teste
	- Pode ser determinada a partir de classe de equivalência. (particionamento da malha de teste)
- Especificação
	- Funcionabilidade do programa. O que ele tem que fazer.
	- É sobre isso que se cria o caso de teste.
	- É o coração de tudo. *Sem uma boa especificação nunca vai fazer um bom teste.*
	- Tem de ser clara e funcional.

### Validação e Verificação:

- *Validação*:   Construimos o que queríamos?
- *Verificação*: Estamos construindo de maneira correta?

### Arquitetura geral de um teste:

TODO: Inserir imagem

### Entradas
- O teste deve contemplar o domínio de entrada válido e inválido
- Importante avaliar entradas inválidas
- Teste de valores inválidos pode revelar falhas

### Exemplo
- O programa P recebe dois inteiros positivos distintos como entrada e determina qual é maior.
	- Domínio: Todos pares de inteiros (x,y)
	- Dado de teste: (1,2; (2,3); (-1,2)...
	- Caso de Teste, <(1,2), 2>; <(2,3), 3>; <(-1,2) falha>; <(2,2), falha>...

### Problema: Como definir uma malha de teste?
- deve ter alta *probabilidade* de revelar falhas
- deve possuir tamanho mínimo

### Exemplo
- O programa P recebe 2 inteiros positivos distintos e deve determinar qual é maior.
	- Subdominio
	- S' = {<(1,2),2>; <(2,3),3>; ...} = {<(1,2),2>}
	- S''= {<(2,1),2>; <(3,2),3>; ...}
	...

### Requisitos de teste
- Regra que define o subdominio
	- especfic
	- exercitar uma estrutura
		- percorer caminhos
		- instruções
		- pontos de decisão
- Ideal: para cada falha apenas um caso de teste

### Fases de teste
-Teste de Unidade
	- Aplicado pelo dev
	- Erro de estrutura de dados, algoritmos incoretos ou simples erros de programação
- Teste de Integração
	- Equipe de desenvolvedores
	- Erros de interface
- Teste de Sistema
	- Uma equipe de teste
	- Feito ao término do sistema
	- Requisitos não funcionais (segurança, robustez, etc.)
	- Corretude, completude e coerência

