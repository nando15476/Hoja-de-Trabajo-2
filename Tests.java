import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Laptop
 *
 */
public class Tests {

	@Test
	public void test() {
		Operaciones opTest = new Operaciones();
		double rSuma = opTest.operacion("+", 2, 3);
		assertEquals(5, rSuma, 0.001);
		double rResta = opTest.operacion("-", 3, 2);
		assertEquals(1, rResta, 0.001);
		double rMult = opTest.operacion("*", 2, 3);
		assertEquals(6, rMult, 0.001);
		double rDiv = opTest.operacion("/", 6, 2);
		assertEquals(3, rDiv, 0.001);
	}
}
