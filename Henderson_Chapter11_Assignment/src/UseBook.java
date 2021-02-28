public class UseBook
{
   public static void main(String[] args)
   {
      Fiction fic = new Fiction("War of the Worlds");
      NonFiction nonFic = new NonFiction("A Brief History of Time");
      System.out.printf("%-25s $%.2f%n", fic.getTitle(), fic.getPrice());
      System.out.printf("%-25s $%.2f%n", nonFic.getTitle(), nonFic.getPrice());
   }
}