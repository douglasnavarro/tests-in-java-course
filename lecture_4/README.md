# Aula 4

- Já vimos a ferramenta Eclemma (plugin emma para eclipse, ferramenta de cobertura)

### JUnit

- Como usamos na prática?
	- projeto e projeto de teste (diferentes)
	- quando for criar um jar, ficam separados
	- posso executar de forma independente (lembre-se do incidente dos misseis)
- @BeforeClass
	- Ele faz um setupClass
	- Quando eu vou testar um ou dois métodos eu preciso que todo o sistema esteja em um determinado estado

- @Test
	- O inicio de fato do teste
	- Estamos buscando testar unidades independentes
	- Vincular metodo da classe de teste ao metodo da classe testada (metodoTal <-> metodoTalTest)
	- assertEquals (nada mais é que um método)
	- @Test(expected = blablablaExceptionj.class) para testar exceção
	- Pegar exemplo para fazer teste de array

- Rodar projeto de teste pode ferrar o sistema?
	- Pode, pois ele altera estado do sistema
	- Não pode rodar com sistema de produção. Deve ser feito com um clone!
	
### TDD

- Ideias
	- Kiss (Keep it simple, stupid)
	- "You aint gonna need it (YAGNI)
	- Pensar em estabilidade, tirar qualquer coisa que seja em excesso

- Ciclos
	- Definição dos casos de  teste
		- antes de escrever definir o caso de teste
		- entender mto bem a especificação (use case ou story)
	- Execução
		- execute todos os testes (vao falhar!)
		- o teste novo gera erro (por que?)
	- Codificação
		- se todos os testes passarem escreva o código
		- senão retorne a versão anterior
	- Refatore
	- Repita o processo

- Vantagem
	- programadores entendem melhor o programa
	- aplicação é mais simples (passar no teste)
	- sem depuração
	- singularidades e limites são testados em separado
	- alta modularidade

- Limite
	- necessita ser bem gerenciado
	- cobertura de falha é fraca
	- erros na formulação do caso de teste serão repassados para o código
	- foco no teste de unidade por levar a um menosprezo do teste de integração e sistema

### Testes de desempenho
- Encontrar gargalos no sistema. Muito usado em aplicações para web.
- Por que fazer teste de performance?
	- Identificar problemas com expansao, aumentos de custo etc.
	- avaliação para diretoria

- Tipos:
	- Performance: valida os limites especificados
	- Teste de carga:
		- picos
		- endurance test
	- Stress:
		- abaixo e acima do normal
		- spike testing
	- capacidade:
		- tratar alta carga sem perda de performance

- Relação
	- É rápido o suficiente? TP
	- Aguenta quanto? TC
	- Se algo der errado? TS

- Benefícios e Limites
	- T de performance:
		- determina velocidade, escalabilidade, estabilidade
		- determina satsf do cliente
		- identificar erros entre perf. e spec.
		- suporte para tuning planejamento e otimização
- Limite
	- nao identifica erros durante situaçoes extremas
	- deve ser feito no ambiente de execução real
	- pode ser realizado apenas com aplicação pronta

	
