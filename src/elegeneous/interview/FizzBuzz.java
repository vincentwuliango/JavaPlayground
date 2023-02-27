package elegeneous.interview;

import org.junit.jupiter.api.Test;

public class FizzBuzz {
	
	void fizzBuzz(int number) {
		for (int i = 1; i <= number; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	@Test
	void fizzBuzzTest() {
		fizzBuzz(15);
	}
}
