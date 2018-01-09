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
	
