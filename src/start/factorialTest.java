package start;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factorialTest {

	@Test
	void test() {
		factorial f=new factorial();
		assertEquals(120,f.factorial());
	}

}
