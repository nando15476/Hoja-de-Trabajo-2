/**
 * 
 */

/**
 * @author Laptop
 *
 */
public class Character {
	private String character;
	private Character next;
	
	public Character(String character){
		this.character = character;
	}
	
	//Estos son los sets y gets de los caracteres
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public Character getNext() {
		return next;
	}
	public void setNext(Character next) {
		this.next = next;
	}
}
