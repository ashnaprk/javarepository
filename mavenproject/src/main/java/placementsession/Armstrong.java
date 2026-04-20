package placementsession;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;
		int digit;
		while (temp != 0) {
			digit = temp % 10;
			sum = sum + (digit * digit * digit);
			temp = temp / 10;

		}
		if (sum == num) {
			System.out.println(num + " : Armstrong Number");
		} else {
			System.out.println(num + " : Not an Armsrtong Number");
		}
		sc.close();

	}

}
