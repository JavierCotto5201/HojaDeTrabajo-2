/**
 * 
 * @author Diana Zaray Corado #191025 & Javier Alejandro Cotto #19324
 * Implementacion de Calculadora
 *
 */
public class Calculadora implements iCalculadora {

	@Override
	public int sumar(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int suma = 0;
		suma = operando1 + operando2;
		return suma;
	}

	@Override
	public int restar(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int resta = 0;
		resta = operando1 + operando2;
		return resta;
	}

	@Override
	public int multiplicar(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int multiplicar = 0;
		multiplicar = operando1 * operando2;
		return multiplicar;
	}

	@Override
	public int dividir(int operando1, int operando2) {
		// TODO Auto-generated method stub
		int dividir = 0;
		dividir = (int)(operando1/operando2);
		return dividir;
	}

}
