package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.Hello;

class HelloTest {
	Hello h;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi All Tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("bye All Tests");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hi each Tests");
		h=new Hello();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Bye each Tests");
		h=null;
	}

	@Test
	void testGetMessage() {
		System.out.println("Test is running");
		assertEquals("Hello JUnit5 from GI3", h.getMessage("from GI3"));
	}

}
