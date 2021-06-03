package ejercicio2;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CovidTest {
	static Covid c = new Covid ();

	@Test
	public void test() {
		int edad = 62; int numeroDosis = 1;
		int esperado = 2;
		int resultado = c.calcularPrioridadVacunacion(62, 1);
		Assertions.assertEquals(resultado,esperado);
	}
	@Test
	public void test2() {
		int edad = 45; int numeroDosis = 1;
		int esperado = 3;
		int resultado = c.calcularPrioridadVacunacion(45, 1);
		Assertions.assertEquals(resultado,esperado);
	}
	@Test
	public void test3() {
		int edad = 30; int numeroDosis = 0;
		int esperado = 1;
		int resultado = c.calcularPrioridadVacunacion(30, 0);
		Assertions.assertEquals(resultado,esperado);
	}
	
	

}