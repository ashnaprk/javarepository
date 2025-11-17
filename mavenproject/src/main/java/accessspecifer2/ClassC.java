package accessspecifer2;
import accessspecifer1.ClassA;


public class ClassC extends ClassA {
	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.publicmeth();
		System.out.println(obj.pub);
		obj.protectmeth();
		System.out.println(obj.pro);
		obj.defaultmeth();
		//System.out.println(obj.def);
		obj.privatemeth();
		//System.out.println(obj.def);
	}

}
