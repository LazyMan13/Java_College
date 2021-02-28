public class BookArray
{
   public static void main(String[] args)
   {
      Book book[] = new Book[10];
      int i;
      book[0] = new Fiction("It");
      book[1] = new NonFiction("A Brief History of Time");
      book[2] = new Fiction("The Stand");
      book[3] = new NonFiction("Brief Answers to the Big Questions");
      book[4] = new Fiction("The Shining");
      book[5] = new NonFiction("The Grand Design");
      book[6] = new Fiction("Carrie");
      book[7] = new NonFiction("The Theory of Everything");
      book[8] = new Fiction("Misery");
      book[9] = new NonFiction("A Briefer History of Time");
      for(i = 0; i < book.length; ++i)
    	  System.out.printf("%2d. %-35s $%.2f%n", i + 1, book[i].getTitle(), book[i].getPrice());
   }
}
