package revision;

public class Childs2 extends Parents {
	public void daughter()
	{
		System.out.println("DAUGHTER");
	}

	public static void main(String[] args) {
		Childs2 c1=new Childs2();
		c1.Father();
		c1.daughter();
		Childs1 c2=new Childs1();
		c2.Father();
		c2.son();

	}

}
