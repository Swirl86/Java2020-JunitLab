package testCase;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestJunitLab {
	
	private static JunitLab value;
	private static int nrOne;
	private static int nrTwo;
	
	// Denotes that the (annotated) method should be executed before all @Test etc
	// Annotations start with @.
	@BeforeAll
    	static void initAll() {
		value = new JunitLab();
		nrOne = 10;
		nrTwo = 5;
	}
	 
	@BeforeEach  // related to standard test class
    	void init() {
    	}
	
	@Test  // Denotes that the annotated method is a test method.
	void additionTest() { // succeedingTest()
		System.out.println(" Run addition test");
		int output = value.add(nrOne, nrTwo);
		assertEquals(15, output); 
		// Assert is a method useful in determining Pass or Fail tests
		// assertEquals checks if the expected value and the output value is equal
	}
	
	/*@Test
	void additionButFaildTest() { // failingTest()
		System.out.println(" Run addition failing test, Expecting Fail");
		int output = value.add(nrOne, nrTwo);
		assertEquals(13, output);
		// assertEquals fails the test but if I use 
		// assertNotEquals I am expecting this test to fail so the test would pass
	}*/
	

	@Test
	void additionNotEqualTest() { 
		System.out.println(" Run addition NotEquals test");
		int output = value.add(nrOne, nrTwo);
		assertNotEquals(13, output);
	}
	
	@Test
	void subtractionTest() {
		System.out.println(" Run subtraction test");
		int output = value.sub(nrOne, nrTwo);
		assertEquals(5, output);
	}
	
	@Test
	void isGreatestNumberTrueTest() {
		System.out.println(" Run boolean test for true");
		boolean output = value.greatest(nrOne, nrTwo);
		assertTrue(output);
	}
	
	@Test
	void isGreatestNumberFalseTest() { 
		System.out.println(" Run boolean test for false");
		boolean output = value.greatest(nrTwo, nrOne);
		assertFalse(output);
	}
	
	@Test
	void isPalindromeTrueTest() { 
		System.out.println(" Run isPalindrom test for true");
		boolean output = value.isPalindrome("detartrated");
		assertTrue(output);
	}
	
	@Test
	void isPalindromeFalseTest() { 
		System.out.println(" Run isPalindrom test for false");
		boolean output = value.isPalindrome("detartratedttt");
		assertFalse(output);
	}
	
	@Test
	void strNullTest() { 
		System.out.println(" Run strNull test if null");
		assertNull(value.getStr());
	}
	
	@Test
	void arrayNotEmptyTest() { 
		System.out.println(" Run arrayNotEmptyTest check array not empty test");
		assertNotNull(value.getStrArrayValue());
	}
	
	@Test
	void arrayEqualTest() { 
		System.out.println(" Run arrayEqualTest check arrays equal");
		 assertArrayEquals(value.getStrArrayValue(), value.getStrArrayCopyValue());
	}
	
	@Test  // related to standard test class
   	 @Disabled("for demonstration purposes")
   	 void skippedTest() {
        // not executed
   	 }

   	 @Test  // related to standard test class
   	 void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
   	}
    
    	@AfterEach  // related to standard test class
    	void tearDown() {
    	}

    	@AfterAll  // related to standard test class
   	static void tearDownAll() {
    	value = null;
    	}


}
