package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.Calculator;

class CalculatorTest {
	Calculator c;
	@BeforeEach
	void setUp() throws Exception {
		c=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;
	}

	@Test
	void test() {
		int sum = c.evaluate("1+2+3");
		assertEquals(6, sum);
	}
	@Test
	void testAdd() {
		int sum=c.add(1, 2);
		assertEquals(3, sum);
	}
	@Test
	void testSub() {
		int sum=c.Substract(1, 2);
		assertEquals(-1, sum);
	}
	@Test
	void testMultiply() {
		int sum=c.Multiply(5, 2);
		assertEquals(10, sum);
	}
	@Test
	void testDivide() {
		int sum=c.Divide(10, 2);
		assertEquals(5, sum);
	}
	@Test 
	void exceptionTesting() {
		Exception exception = assertThrows(ArithmeticException.class,
				() -> c.Divide(1,0)) ; 
		assertEquals("Division par 0", exception.getMessage()) ; 
		
	}
	

}
