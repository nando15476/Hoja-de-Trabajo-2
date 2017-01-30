/**
 * 
 */

/**
 * @author Laptop
 *
 */
public class Operaciones implements IHDT2 {
	private Character head;
	
	//Este metodo llama al caracter anterior de la lista
	public Character getLast(){
		Character actualChar = head;
		if(actualChar == null)
			return actualChar;
		while(actualChar != null)
			actualChar = actualChar.getNext();
		return actualChar;
	}
	
	//Este metodo agrega un caracter a la lista
	public void addChar(String character){
		Character end = getLast();
		if(end == null)
			head = new Character(character);
		else
			end.setNext(new Character(character));
	}
	
	//Este metodo devuelve el caracter actual
	public Character returnChar(){
		return head;
	}
	
	//Este metodo realiza las operaciones
	public double operacion(String operacion, double num1, double num2){
		if(operacion.equals("+"))
			return num1 + num2;
		else if(operacion.equals("-"))
			return num1 - num2;
		else if(operacion.equals("*"))
			return num1 * num2;
		else if(operacion.equals("/"))
			return num1 / num2;
		return 0;	
	}

	//Este metodo devuelve el nombre de la operacion
	public String operacion(String operacion) {
		if(operacion.equals("+"))
			return "Suma          ";
		else if(operacion.equals("-"))
			return "Resta         ";
		else if(operacion.equals("*"))
			return "Multiplicacion";
		else if(operacion.equals("/"))
			return "Division      ";
		return null;
	}
}
