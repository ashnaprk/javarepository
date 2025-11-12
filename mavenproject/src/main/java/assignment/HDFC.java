package assignment;

public class HDFC implements RBI {
	public void recurringdeposit(double amount,int duration)
	{
		double r=interest;
		double maturityamount=(amount*duration)+(amount*duration*(duration+1)/2)*(r/100)*(1.0/12);
		System.out.println("Principal amount per month: "+amount);
		System.out.println("Duration: "+duration);
		System.out.println("Interest: "+r+ "%");
		System.out.println("Maturity Amount: "+maturityamount);
		
	}

	public static void main(String[] args) {
		{
			HDFC c=new HDFC();
			c.recurringdeposit(2000, 12);
		}
	}
}
