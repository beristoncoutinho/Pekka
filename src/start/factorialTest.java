package start;
//This method test Factorial of number
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factorialTest {

	@Test
	void test() {
		fact f=new fact();
		assertEquals(120,f.factorial());
	}

}
