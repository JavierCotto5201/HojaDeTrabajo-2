import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class LeerArchivos {
	
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException{
		Stack<String> pila = new Stack<String>();
		String v;
		String u;
		String res;
		String cadena;
		FileReader f = new FileReader(archivo);
	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {
	    	 
	    	System.out.println(cadena);
	    	String[] cadLista = cadena.split(" ");
	    	
	    	for(int i=0; i<cadLista.length;i++){
	    		
	    		if(cadLista[i].equals("+")) {
	    				v=pila.pop();
	    				u=pila.pop();
	    				res=String.valueOf(Integer.valueOf(v) + Integer.valueOf(u));
	    				pila.push(res);
	    		}else 
	    			if(cadLista[i].equals("-")) {
	    				v=pila.pop();
	    				u=pila.pop();
	    				res=String.valueOf(Integer.valueOf(v) - Integer.valueOf(u));
	    				pila.push(res);
	    		}else 
	    			if(cadLista[i].equals("*")) {
	    				v=pila.pop();
	    				u=pila.pop();
	    				res=String.valueOf(Integer.valueOf(v) * Integer.valueOf(u));
	    				pila.push(res);
		    	}else 
		    		if(cadLista[i].equals("/")) {
		    			v=pila.pop();
	    				u=pila.pop();
	    				res=String.valueOf(Integer.valueOf(v) / Integer.valueOf(u));
	    				pila.push(res);
	    		}else
	    			pila.push(cadLista[i]);
	    	}
	    	
	   	   	pila.push(cadena);  
	    	System.out.println(pila);
	      }
	      b.close();
	}
	
	public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\claudia\\Desktop\\Algortimos y Estructuras de Datos\\HT_2\\src/Calculos.txt.");
    }
	
   }
