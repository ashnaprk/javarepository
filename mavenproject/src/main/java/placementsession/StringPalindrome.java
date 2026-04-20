package placementsession;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		if (s.equals(rev)) {
			System.out.println(s + " Is a Palindrome");
		} else {
			System.out.println(s + " Not a Palindrome");
		}
		sc.close();

	}

}
