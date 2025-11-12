package assignment;

public  class Contractor extends Employe {
	int workinghr;
	Contractor(String name,double paymentperhour,int workinghr )
	{
		super(name,paymentperhour);
		this.workinghr=workinghr;
		
	}
	public double calsalary()

	{
		return paymentperhour*workinghr;
	}
			
}
