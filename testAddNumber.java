package Junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumber {

	@Test
	void test() {
		Junitfunction junit = new Junitfunction();
		int result = junit.AddNumber(2,5);
		assertEquals(7 , result);
	}

}
