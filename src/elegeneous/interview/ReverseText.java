package elegeneous.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseText {
	String reverseString(String text) {
		String result = "";
		int j = text.length();
		for (int i = 0; i < j; i++) {
			result += text.charAt(j - i - 1);
		}
		
		return result;
	}
	
	@Test
	void reverseStringTest() {
		Assertions.assertEquals("iah", reverseString("hai"));
		Assertions.assertEquals("cba", reverseString("abc"));
		Assertions.assertEquals("rupiah", reverseString("haipur"));
	}
}
