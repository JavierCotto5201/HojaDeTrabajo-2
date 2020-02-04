import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class LeerArchivos {
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException{
		String cadena;
		FileReader f = new FileReader(archivo);
	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {
	    	  System.out.println(cadena);
	    	  
	    	Stack<String> pila = new Stack<String>();
	   	   	pila.push(cadena);
	   	 	System.out.println(pila);
	      }
	      b.close();
	}
	
	public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\Javier Cotto\\Desktop\\UVG Trabajos/archivo.txt");
    }
	
   //public static void Verificar(String cadena) {
	 //  Stack<String> pila = new Stack<String>();
	   //pila.push(cadena);
	 	 //  System.out.println(pila);
	   	//}
   }
