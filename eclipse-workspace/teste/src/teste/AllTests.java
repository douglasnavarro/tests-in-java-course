package teste;

import static org.junit.Assert.*;

import org.junit.*;

import aula4.operacoes;


public class AllTests {
	
	@BeforeClass
	public static void setupClass() throws Exception 
	{
		operacoes.NUMERO = 20;
	}
	
	@Test
	public void somaTestInt()
	{
		operacoes op = new operacoes();
		assertEquals("Teste de soma de inteiros", op.soma(10, 10), 20);
	}
	
	@Test
	public void subTestInt()
	{
		operacoes op = new operacoes();
		assertEquals("Teste de sub de inteiros", op.sub(10, 10), 0);
	}
	
	@Test
	public void multTestInt()
	{
		operacoes op = new operacoes();
		assertEquals("Teste de mult de inteiros", op.mult(10, 10), 50);
	}
	

}
