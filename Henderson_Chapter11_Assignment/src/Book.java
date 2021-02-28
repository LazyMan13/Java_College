public abstract class Book
{
   String title;
   double price;
   public Book(String t)
   {
      title = t;
      price = 0.0;
   }

   public abstract String getTitle();
   public abstract double getPrice();
 
}