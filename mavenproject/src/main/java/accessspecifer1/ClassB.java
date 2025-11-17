package accessspecifer1;

public class ClassB {
	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.protectmeth();
		System.out.println(obj.pro);
		obj.privatemeth();
		//System.out.println(obj.pri); private cannot call in other class
		
		obj.defaultmeth();
		System.out.println(obj.def);
		obj.publicmeth();
		System.out.println(obj.pub);
	}

}
