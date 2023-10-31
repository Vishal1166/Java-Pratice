import java.util.Set;
public class BookMain {
	public static void main(String[] args) {		
		BookInfo b=new BookInfo();	
		Set<Book> trees=b.createbook();
		b.Display(trees);
	}
}
