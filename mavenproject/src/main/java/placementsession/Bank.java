package placementsession;

public class Bank {
	
	private double balance;
	
	public double checkBalance()
	{
		return balance;
	}
	public void updateBalance(double deposit)
	{
		balance=balance+deposit;
	}
	

}
