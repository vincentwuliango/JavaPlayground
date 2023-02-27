package elegeneous.application;

import elegeneous.data.Car;
import elegeneous.data.Vehicle;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Vehicle a = new Car();
		System.out.println(a.wheels());
		
		Scanner scan = new Scanner(System.in);
		var number = scan.nextInt();
		var convert = String.valueOf(number);
		var result = convert.getClass().getSimpleName().equals("String") ? "Good job" : "Wrong answer";
		
		System.out.println(result);
		
	}
}
