package revision;

public class Engine extends Model{
	public void enginemodel()
	{
		System.out.println("Petrol");
	}

	public static void main(String[] args) {
		Engine e=new Engine();
		e.name();
		e.modeltype();
		e.enginemodel();

	}

}
