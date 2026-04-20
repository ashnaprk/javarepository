package placementsession;

import java.util.Scanner;

public class StringCharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			if (s.indexOf(s.charAt(i)) != i) {
				continue;
			}
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s.charAt(i) + "=" + count);

		}
		sc.close();

	}

}
