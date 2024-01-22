package study;

public class Calculator {
	public void calculator(int x, int y) {
		for (int i = 0; i < 3; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(x + y);
		}
	}
}

class SubstractCalculator extends Calculator {
	public void calculator(int x, int y) {
		for (int i = 0; i < 4; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(x - y);
		}
	}
}

class MultiplyCalculator extends Calculator {
	public void calculator(int x, int y) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(x * y);
		}
	}
}

class DivideCalculator extends Calculator {
	public void calculator(int x, int y) {
		for (int i = 0; i < 5; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(x / y);
		}
	}
}