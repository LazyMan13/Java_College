
public class Fiction extends Book
{

	public Fiction(String t)
	{
		super(t);
		setPrice();
	}
	
	public void setPrice()
	{
		price = 24.99;
	}
	
	public String getTitle()
	{
		return title;
	}
	public double getPrice()
	{
		return price;
	}


}
