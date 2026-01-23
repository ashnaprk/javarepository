package multipleinheritance;

public class Child implements Parent1,Parent2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.data();
		c.datamore();

	}
	public void datamore() {
		System.out.println("parent2class data");
		
		
	}

	public void data() {
	System.out.println("parent1class data");	
		
	}

}
