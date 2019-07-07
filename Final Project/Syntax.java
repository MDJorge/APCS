import java.awt.*;

public class Syntax {
	public static boolean check(String input) {
		int begin = 0;
		int end = 0;

		for (char x: input.toCharArray()) {
			if (x == '(') {
				begin++;
			}
			if (x == ')') {
				end++;
			}
		}

		return begin == end;
	}
}