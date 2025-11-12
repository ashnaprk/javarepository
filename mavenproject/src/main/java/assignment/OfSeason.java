package assignment;

public class OfSeason extends OnSeason  {
	public void discount(double price)
	{
		double discount=price*0.15;
		double finalprice=price-discount;
		System.out.println("OfSeason Discount:15%");
		System.out.println("Final price: "+finalprice);
	}
	

	public static void main(String[] args) {
		OnSeason on=new OnSeason();
        OfSeason of=new OfSeason();
        on.discount(5000);
        of.discount(5000);

	}

}
