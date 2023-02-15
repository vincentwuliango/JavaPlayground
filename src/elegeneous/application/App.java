package elegeneous.application;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		isPalindromeTest();
	}
	
	public static void fizzBuzz(Integer number) {
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
		
		fizzBuzz(number);
	}
	
	public static boolean isPalindrome(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				return false;
			}
		}
		return true;


//		var temp = "";
//		for (int i = word.length() - 1; i >= 0; i--) {
//			temp += word.charAt(i);
//		}
//		var result = temp.equals(word) ? "Palindrome" : "Not Palindrome";
//		System.out.printf("%s is %s\n", word, result);
	}
	
	public static void isPalindromeTest() {
		isPalindrome("aba");
		isPalindrome("kodok");
		isPalindrome("kodoks");
		isPalindrome("abc");
		isPalindrome("212");
		isPalindrome("212212");
		isPalindrome("ab");
		isPalindrome("Vincent");
		isPalindrome("Aba");
	}
}
