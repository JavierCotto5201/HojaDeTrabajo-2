import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;


public class pCalculadora <E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		iCalculadora calculadora = new Calculadora();
		
		String cadena;
		int operando1, operando2;
		
		try{
			FileReader f = new FileReader("C:\\Users\\claudia\\Desktop\\Algortimos y Estructuras de Datos\\HT_2\\src/Calculos.txt");
		
	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {
	    	 
	    	System.out.println("La operacion a realizar es: " + cadena);
	    	String[] cadLista = cadena.split(" ");
	    	
	    	for(int i=0; i<cadLista.length;i++){
	    		
	    		if(cadLista[i].equals("+")) {
	    			operando1 = Integer.valueOf(stack.pop());
					operando2 = Integer.valueOf(stack.pop());
					stack.push(String.valueOf(calculadora.sumar(operando1,operando2)));
	    		}else 
	    			if(cadLista[i].equals("-")) {
	    				operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.restar(operando1,operando2)));
	    		}else 
	    			if(cadLista[i].equals("*")) {
	    				operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.multiplicar(operando1,operando2)));
		    	}else 
		    		if(cadLista[i].equals("/")) {
		    			operando1 = Integer.valueOf(stack.pop());
						operando2 = Integer.valueOf(stack.pop());
						stack.push(String.valueOf(calculadora.dividir(operando1,operando2)));
	    		}else
	    			stack.push(cadLista[i]);
	    	}
	   	   	stack.push(cadena);
	   	   	stack.pop();
	    	System.out.println("El resultado es: " + stack.pop());
	      }
	      b.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
			
		

	


