package Junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		Junitfunction junit = new Junitfunction();
		String result = junit.AddString("shubham"," singh");
		assertEquals("shubham singh" , result);
	}

}
