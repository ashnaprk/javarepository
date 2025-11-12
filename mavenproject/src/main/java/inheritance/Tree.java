package inheritance;

public class Tree extends Plant{
	public void shade()
	{
		System.out.println("Tree gives shade");
	}

	public static void main(String[] args) {
		Tree t=new Tree();  // here tree extends plant only
		t.shade();
		t.grow();
		Flower f=new Flower(); //here flower extends plant
		f.bloom();
		f.grow();

	}

}
//hierarchical inheritance two or more classes inherit a single class