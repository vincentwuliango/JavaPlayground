package elegeneous.application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		testFizzBuzz();
	}
	
	public static void FizzBuzz(Integer number) {
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
	
	public static void testFizzBuzz() {
		Scanner scan = new Scanner(System.in);
		var number = 0;
		System.out.print("Input number: ");
		number = scan.nextInt();
		
		FizzBuzz(number);
	}
}
