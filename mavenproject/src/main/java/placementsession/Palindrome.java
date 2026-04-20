package placementsession;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		int digit;
		while (num != 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (temp == rev) {
			System.out.println(temp + " :Is a palindrome");
		} else {
			System.out.println(temp + " :Is not a pallindrome");
		}
		sc.close();

	}

}
