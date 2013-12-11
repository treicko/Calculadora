package Calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void LaSumaDeUnNumeroMasCeroDebeSerElMismoNumero() {
		Calculadora calculadora = new Calculadora();
		int numero = 12;
		assertEquals(numero, calculadora.Sumar(numero,0));
	}
	
	@Test
	public void DevuelveNueveQueEsLaSumaDeCincoYCuatro()
	{
		Calculadora calculadora = new Calculadora();
		int numero1 = 5;
		int numero2 = 4;
		assertEquals(9, calculadora.Sumar(numero1,numero2));
	}
	
	@Test
	public void LaRestaDeUnNueroConCeroEsElMismoNumero(){
		Calculadora calculadora = new Calculadora();
		int numero = 12;
		assertEquals(numero, calculadora.Resta(numero,0));
	}
	
	@Test
	public void DevuelveUnoQueEsLaRestaDeCincoYCuatro(){
		Calculadora calculadora = new Calculadora();
		int numero1 = 5;
		int numero2 = 4;
		assertEquals(1, calculadora.Resta(numero1, numero2));
	}

}
