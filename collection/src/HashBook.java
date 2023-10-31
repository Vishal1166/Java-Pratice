import java.util.Objects;

public class HashBook
{	
       private int bookid;
       private String bookname;
       private double bookprice;
	public HashBook(int bookid, String bookname, double bookprice) {
		super();
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
	public int hashCode() {
		return Objects.hash(bookid, bookname, bookprice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashBook other = (HashBook) obj;
		return bookid == other.bookid && Objects.equals(bookname, other.bookname)
				&& Double.doubleToLongBits(bookprice) == Double.doubleToLongBits(other.bookprice);
	}
}

