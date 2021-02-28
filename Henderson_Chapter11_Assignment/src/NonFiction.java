public class NonFiction extends Book
{

	public NonFiction(String t)
	{
		super(t);
		setPrice();
	}
	
	public void setPrice()
	{
		price = 37.99;
	}

	public String getTitle()
	{
		return this.title;
	}
	public double getPrice()
	{
		return this.price;
	}


}