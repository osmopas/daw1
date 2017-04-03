import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora calc;
	
	@Before
	public void antesDelTest(){
		calc = new Calculadora();
	}
	
	
	@Test
	public void sumarTest() {
		int resultado = calc.sumar(22,4);
		assertEquals("Metodo sumar: ",26,resultado,0);
		System.out.println(resultado);
	}
	
	@Test
	public void restarTest() {
		int resultado = calc.restar(14,7);
		assertEquals("Metodo resta: ",7,resultado,0);
		System.out.println(resultado);
	}
	
	@Test
	public void multiplicarTest() {
		float resultado = calc.multiplicar(3,4);
		assertEquals("Metodo multiplicacion: ",12.0,resultado,0);
		System.out.println(resultado);
	}
	
	@Test
	public void dividirTest() {
		float resultado = calc.dividir(8,4);
		assertEquals("Metodo division: ",2.0,resultado,0);
		System.out.println(resultado);
	}

}