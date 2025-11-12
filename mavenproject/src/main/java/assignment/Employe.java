package assignment;

public abstract class Employe {
	String name;
    double paymentperhour;
    Employe(String name,double paymentperhour)
    
    {   this.name=name;
    	this.paymentperhour=paymentperhour;
    	
    }
    abstract double calsalary();
    

}
