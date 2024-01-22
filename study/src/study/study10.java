package study;

import java.util.Random;

public class study10 {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			System.out.print(random.nextInt(100) + " ");
		}
	}
}
