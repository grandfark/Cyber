package study;

public class study4 {
	public static void calculate(int x, int y) {
		for (int i = 1; i < 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(x * y);
		}
	}

	public static void calculate(double x) {
		for (int i = 1; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(x * x);
		}
	}

	public static void main(String[] args) {
		calculate(2, 3);
		calculate(2);
	}
}
