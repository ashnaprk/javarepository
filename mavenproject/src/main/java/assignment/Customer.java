package assignment;

import java.util.Scanner;

public class Customer extends Bank{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		System.out.println("enter the pin");
		int p=sc.nextInt();
		
		b.setpin(p);
		if(b.validatepin())
		{
			System.out.println("PIN is valid");
			b.withdrawal();
		}
		else
		{
			System.out.println("PIN is invalid");
		}
        sc.close();
        
	}

            
}
