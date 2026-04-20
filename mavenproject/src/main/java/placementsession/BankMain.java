package placementsession;

public class BankMain {

	public static void main(String[] args) {
	
		
		Bank b=new Bank();
		b.updateBalance(1000);//first deposit
		System.out.println("Balance: "+b.checkBalance());
		b.updateBalance(200);//second deposit
		System.out.println("Updated Balance: "+b.checkBalance());
       
        
	}

}
