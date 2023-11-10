package Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.LeapYear;

public class LeapYearTest {

	private LeapYear leapYear;

	@BeforeEach
	void setUp() throws Exception {
		leapYear = new LeapYear();
	}

	@AfterEach
	void tearDown() throws Exception {
		leapYear = null;
	}

	@Test
	void testIsLeapYear() {
		assertTrue(leapYear.isLeapyear(2000));
		assertTrue(leapYear.isLeapyear(2020));
		assertTrue(leapYear.isLeapyear(2400));
		assertFalse(leapYear.isLeapyear(1900));
		assertFalse(leapYear.isLeapyear(2022));
	}
}
