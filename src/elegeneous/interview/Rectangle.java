package elegeneous.interview;

import org.junit.jupiter.api.Test;

public class Rectangle {
	
	void rectangle(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	void rectangleTest() {
		rectangle(5);
	}
}
