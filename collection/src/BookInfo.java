import java.util.Set;
import java.util.TreeSet;

public class BookInfo 
{
	public Set<Book> createbook()
	{
		Book b1=new Book(101,"java",500);
		Book b2=new Book(102,"Python",700);
		Book b3=new Book(101,"java",500);
		
		Set<Book> tree=new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		
	  return tree;
	 }
	
  public void Display(Set<Book> tree)
  {
	  for(Book b: tree)
	  {
		  System.out.println(b.getBookid()+"\t"+b.getBookname()+"\t"+b.getBookprice());
	  }
  }
}
