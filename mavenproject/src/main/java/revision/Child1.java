package revision;

public class Child1 extends Parent{
	public void p()
	{
		System.out.println("Child 1 class");
	}
public static void main(String[] args) {
	Parent ps=new Child1();
	ps.p();
}
}

