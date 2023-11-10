package Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Main.PasswordValidator;

public class PasswordValidatorTest {
	PasswordValidator passwordValidator;

	@Test
	void testValidPassword() {
		assertTrue(passwordValidator.isValid("Abc123"));
	}

	@Test
	void testTooShortPassword() {
		assertFalse(passwordValidator.isValid("Ab1"));
	}

	@Test
	void testTooLongPassword() {
		assertFalse(passwordValidator.isValid("Abcdefghij123"));
	}

	@Test
	void testNoDigitPassword() {
		assertFalse(passwordValidator.isValid("Abcdefghij"));
	}

	@Test
	void testNoUppercaseLetterPassword() {
		assertFalse(PasswordValidator.isValid("abc123"));
	}
}
