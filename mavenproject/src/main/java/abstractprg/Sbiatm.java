package abstractprg;

public class Sbiatm extends Atm {
	public void withdraw()
	{
		System.out.println("money withdraw successfully");
	}
  public void balance()
  {
	  System.out.println("balance amount is 10,000");
  }
	public static void main(String[] args) {
		Sbiatm s=new Sbiatm();
		s.balance(); //also upcasting can be used
		             // Atm s=new Sbiatm();
		s.withdraw();// s.withdraw
			         // s.balance
		

	}

}
