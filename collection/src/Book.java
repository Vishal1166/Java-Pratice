
public class Book implements Comparable<Book>
{
	private int bookid;
	private String bookname;
	private double bookprice;
	
	public Book(int bookid, String bookname, double bookprice) {

		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	
	@Override
	public int compareTo(Book o)
	{
		if(this.getBookid()>o.getBookid())
		{
			return 1;
		}
		else if(this.getBookid()<o.getBookid())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}

