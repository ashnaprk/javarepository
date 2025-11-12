package assignment;

public class Total extends Percentage{
	double totalsal;
	
	public void caltotalsalary()
	{
		totalsal=basic+hra-pf-deduction+bonus;
	}
	public void printdetails() 
	{
		System.out.println("salary slip");
		System.out.println("basic pay " + basic);
		System.out.println("hra 5% " + hra);
		System.out.println("pf 20% " + pf);
		System.out.println("deduction " + deduction);
		System.out.println("bonus " + bonus);
		System.out.println("totalsalary" + totalsal);
	}
	public static void main(String[] args) {
     Total n=new Total();
     n.details();
     n.calculate();
     n.caltotalsalary();
     n.printdetails();

	}

}
