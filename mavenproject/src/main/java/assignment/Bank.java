package assignment;

import java.util.Scanner;
public class Bank {
	private int pin;
	public void setpin(int p)
	{
		pin=p;
	}
	public boolean validatepin()
	{
		if(pin==1001||pin==1234||pin==1212)
			return true;
		else 
			return false;
		
	}
	public void withdrawal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amount =sc.nextInt();
		System.out.println("Rs "+amount+"withdrawn successfully");
		sc.close();
	}
	

}

