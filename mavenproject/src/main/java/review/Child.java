package review;

public class Child implements Parent1,Parent2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.details();
		c.detailsmore();
		

	}

	@Override
	public void detailsmore() {
		System.out.println("SECOND PARENT CLASS");
		
	}

	@Override
	public void details() {
		
		System.out.println("FIRST PARENT CLASS");
		
	}

}
