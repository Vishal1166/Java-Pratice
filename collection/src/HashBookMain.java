import java.util.HashSet;
import java.util.Set;

public class HashBookMain 
{
	public static void main(String[] args)
	{		
		Set<HashBook> hashset=new HashSet<HashBook>();
		
		hashset.add(new HashBook(101, "java", 500));
		hashset.add(new HashBook(102,"Pythone", 700));
		hashset.add(new HashBook(101,"java", 500));
		hashset.add(new HashBook(10,"oracle", 300));
		for(HashBook b: hashset)
		{
		System.out.println(b.getBookid()+"\t"+b.getBookname()+"\t"+b.getBookprice());
		}
	}
}
