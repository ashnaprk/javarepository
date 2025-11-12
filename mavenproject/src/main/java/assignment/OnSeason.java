package assignment;

public class OnSeason {
	public void discount(double price)
	{
		double discount=price*0.40;
		double finalprice=price-discount;
		System.out.println("OnSeason Discount:40%");
		System.out.println("Final Price "+finalprice);
	}

}
