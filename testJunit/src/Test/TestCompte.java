package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Main.Compte;
class TestCompte {
	Compte C;
	@BeforeEach
	void setUp() throws Exception {
		C= new Compte(11111, 1000);
	}

	@AfterEach
	void tearDown() throws Exception {
		C=null;
	}

	@Test
	void testdeposer() {
		int soldeinitial= C.solde();
		C.deposer(500);
		assertEquals(soldeinitial+500,C.solde());
	}
	@Test
	void testretirer() {
		int soldeinitial= C.solde();
		C.retirer(500);
		assertEquals(soldeinitial-500,C.solde());
	}
	@Test
	void testsolde() {
		assertTrue(C.solde()==1000);
	}

}
