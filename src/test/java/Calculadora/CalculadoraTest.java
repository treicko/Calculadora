package Calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora;
	
	@Before
	public void setUp() throws Exception {
		calculadora = new Calculadora();
	}

	@Test
	public void LaSumaDeUnNumeroMasCeroDebeSerElMismoNumero() {
		int numero = 12;
		assertEquals(numero, calculadora.Sumar(numero,0));
	}
	
	@Test
	public void DevuelveNueveQueEsLaSumaDeCincoYCuatro()
	{
		assertEquals(9, calculadora.Sumar(5,4));
	}
	
	@Test
	public void LaRestaDeUnNueroConCeroEsElMismoNumero(){
		int numero = 12;
		assertEquals(numero, calculadora.Resta(numero,0));
	}
	
	@Test
	public void DevuelveUnoQueEsLaRestaDeCincoYCuatro(){
		assertEquals(1, calculadora.Resta(5, 4));
	}
	
	@Test
	public void LaMultiplicacionDeCualquierNumeroPorCeroEsCero(){
		assertEquals(0, calculadora.Multiplicacion(9,0));		
	}
	
	@Test
	public void DeVuelveVeinteQueEsLaMultiplicacionDeCincoYCuatro(){
		assertEquals(20, calculadora.Multiplicacion(5, 4));
	}
	
	@Test
	public void LaDivisionDeCualquierNumeroEntreUnoEsElMismoNumero(){
		assertEquals(9, calculadora.Division(9,1));
	}

}
