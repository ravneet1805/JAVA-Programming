import java.util.*;

public class HighestOccChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		int count = 0;
		int max = 0;
		char x = ' ';

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}

			}

			if (count > max) {
				max = count;
				x = str.charAt(i);

			}
			count = 0;
		}

		System.out.println(x);
	}
}
