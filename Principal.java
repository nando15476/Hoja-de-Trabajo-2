/*
 * Fernando Hernandez 15476
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 
 */

/**
 * @author Laptop
 *
 */
public class Principal {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("prueba.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = reader.readLine();
		Character character;
		Operaciones op = new Operaciones();
		
		//Este ciclo hace que realice todas las lineas del archivo
		while(text != null){
			int n = 1;
			op.addChar(text.substring(n - 1, n));
			int x = 1;
			double num1 = 0;
			
			//Este ciclo hace que num1 (el primer numero para operar) sea le primer numero que se encuentre en la linea
			while(x == 1){
				try{
					op.addChar(text.substring(n - 1, n));
					num1 = Integer.parseInt(op.returnChar().getCharacter());
					System.out.println("******************************************************\n"
							+ "Entrada     Operacion          Pila\n" + num1 + "        push operando       " + num1);
					x = 0;
				}
				catch(Exception e){
					n++;
					x = 1;
				}
			}
			
			int num2 = 0;
			String operacion;
			
			//Este ciclo recorre la linea y hace las poeraciones
			while(text.substring(n - 1, n) != null && n < text.length()){
				op.addChar(text.substring(n, n + 1));
				
				//Este try/catch identifica si los caracteres son numeros, espacios u operadores
				try{
					num2 = Integer.parseInt(op.returnChar().getCharacter());
					System.out.println(num2 + "          push operando       " + num1 + ", " + num2);
					n++;
				}
				catch(Exception e){
					op.addChar(text.substring(n, n + 1));
					if(op.returnChar().getCharacter().equals(" ")){
						n++;
					}
					else{
						num1 = op.operacion(op.returnChar().getCharacter(), num1, num2);
						System.out.println(op.returnChar().getCharacter() + "          " 
						+ op.operacion(op.returnChar().getCharacter()) + "      " + Math.round(num1 * 100) / 100.0);
						n++;
					}
				}
			}
			
			//Aqui se imprime el resultado
			System.out.println("\n" + text + "\nResultado: " + Math.round(num1 * 100) / 100.0 + "\n");
			text = reader.readLine();
		}
	}
}
