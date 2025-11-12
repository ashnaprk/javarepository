package assignment;

public class FullTimeEmploye extends Employe{
	FullTimeEmploye(String name,double paymentperhour)
	{
		super(name,paymentperhour);
		
	}
    double calsalary()
    {
    	return paymentperhour*8;
    }

public static void main(String[] args) {
	Contractor c=new Contractor("Rahul",500,7);
	FullTimeEmploye f=new FullTimeEmploye("Ram",400);
	System.out.println("Contractor Name: " + c.name);
	System.out.println("Contractor Salary: " + c.calsalary());
	System.out.println("Full Time Employee Name: " + f.name);
	System.out.println("Full Time Employee Salary; " + f.calsalary());
	
	
}
}
