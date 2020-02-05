import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class input {
	
	private Calculadora calculadora = new Calculadora();
	private Stack stack = new Stack();
	
	
	public String read(String file) {
		
		FileInputStream address = null;
		ObjectInputStream reader = null;
		String operacion = "";
		try {
			address = new FileInputStream(file);
			reader = new ObjectInputStream(address);
	
			operacion = (String) reader.readObject();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return operacion;
		
	}
	
	/**public void calculos(String operandos) {
		
		String[] ope = operandos.split("");
		for(int i = 0; i < ope.length; i++ ) {
			try {
				num = Double.parseDouble(entrada);  
						ok = true;
					 }catch(Exception e){                               
						  
						 ok = false;
					
			}
		}
	}*/
	

}
