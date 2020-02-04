import java.util.Vector;

/**
 * 
 * @author Diana Zaray Corado #191025 && Javier Alejandro Cotto #19324
 * @version 30/01/2020
 * Implementacion de Stack
 *
 */
public class Stack<E>  implements iStack<E>{

	private Vector<E> vector = new Vector<E>();
	
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		vector.add(item);
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return vector.remove(size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return vector.get(size()-1);
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		boolean vacio = false;
		if(size() != 0)
			vacio = true;
			
		return vacio;
	}

	

}
