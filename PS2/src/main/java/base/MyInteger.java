package base;

public class MyInteger {
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	static int iValue;

	private int getiValue() {
		return iValue;
	}

	private void isEven() {
		if ((iValue % 2) == 0)
			;

	}

	private void isOdd() {
		if ((iValue % 2) != 0)
			;
	}

	private void isPrime() {
		boolean prime = true;
		for (int i = 2; i <= iValue / 2; i++) {

			int x = iValue % i;
			if (x == 0) {
				prime = false;
				break;
			}
		}

	}

	private static void isEven(int iValue) {
		if ((iValue % 2) == 0)
			;

	}

	private static void isOdd(int iValue) {
		if ((iValue % 2) != 0)
			;
	}

	private static void isPrime(int iValue) {
		boolean prime = true;
		for (int i = 2; i <= iValue / 2; i++) {

			int x = iValue % i;
			if (x == 0) {
				prime = false;
				break;
			}
		}

	}

	
	private static void isEvenn(int MyInteger) {
		if ((iValue % 2) == 0)
			;

	}

	private static void isOddd(int MyInteger) {
		if ((iValue % 2) != 0)
			;
	}

	private static void isPrimee(int MyInteger) {
		boolean prime = true;
		for (int i = 2; i <= iValue / 2; i++) {

			int x = iValue % i;
			if (x == 0) {
				prime = false;
				break;
			}
		}

	}
	
	
	
	
	
}
