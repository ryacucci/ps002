package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	static int iValue=2;
	@BeforeClass
	
	public static void isEven(int iValue) {
		if ((iValue % 2) == 0)
			;

	}

	public static void isOdd(int iValue) {
		if ((iValue % 2) != 0)
			;
	}

	public static void isPrime(int iValue) {
		boolean prime = true;
		for (int i = 2; i <= iValue / 2; i++) {

			int x = iValue % i;
			if (x == 0) {
				prime = false;
				break;
			}
		}

	}



	@SuppressWarnings("null")
	@AfterClass
	public static void tearDownAfterClass() {
		
	iValue=(Integer) null;
	}
	

	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(isEven(iValue)== true);
		assertTrue(isOdd(iValue)==false);
		assertTrue(isPrime(iValue)==true);
		assertTrue(isEvenn(iValue)==true);
		assertTrue(isoddd(iValue)==false);
		assertTrue(isPrime(iValue)==true);
	
	}

}
