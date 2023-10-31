import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {        
		
		int n1,n2,ans;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two number : ");
		
		try
		{
			n1=Integer.parseInt(args [0]);
			n2=Integer.parseInt(args[1]);
			
			System.out.println("hello");
			ans=n1/n2;
			System.out.println("ans is = "+ans);
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Arithmetic & Array Exception here.."+ex);
		}
		catch(Exception ex)  //parents of all Exception
		{
			System.out.println("any other exception here..."+ex);
		}
		finally // this block always execute  exception come or not 
		{
			System.out.println("always execute");
		}
System.out.println("----thank you -------");
	}

}



