package elegeneous.interview;

import org.junit.jupiter.api.Test;

public class Triangle {
	
	void triangle(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void triangleReverse(int number) {
		for (int i = number; i >= 1; --i) {
			for (int j = 1; j >= number; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	void triangleTest() {
		triangle(5);
	}
	
	@Test
	void triangleReverseTest() {
		triangleReverse(5);
	}
}
