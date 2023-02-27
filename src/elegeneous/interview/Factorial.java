package elegeneous.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Factorial {
	void factorial(int number) {
		int result = 1;
		for (int i = number; i >= 1; i--) {
			result *= i;
		}
		
		System.out.println(result);
	}
	
	int factorialRecursive(int number) {
		if (number <= 0) return 1;
		else return number * factorialRecursive(number - 1);
	}
	
	@Test
	void factorialTest() {
		factorial(5);
		Assertions.assertEquals(120, factorialRecursive(5));
		Assertions.assertEquals(720, factorialRecursive(6));
	}
}
