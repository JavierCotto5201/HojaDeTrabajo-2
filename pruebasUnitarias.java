import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebasUnitarias {
	
	@Test
	public void Addtest() {
		Calculadora junit = new Calculadora();
		int result = junit.sumar(10, 20);
				assertEquals(30, result);
	}
	
	public void Lesstest() {
		Calculadora junit = new Calculadora();
		int result = junit.restar(100, 20);
				assertEquals(70, result);

}
	public void Multtest() {
		Calculadora junit = new Calculadora();
		int result = junit.multiplicar(3, 2);
				assertEquals(6, result);

}
	public void Dividetest() {
		Calculadora junit = new Calculadora();
		int result = junit.dividir(100, 20);
				assertEquals(5, result);

}
}
