import java.util.Scanner;

public class Account_main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		  Bankui ui=new Bankui();
		  Customer cust=ui.create();
		  ui.display(cust);
	   
		  String str=null;
		  do
		  {
		  System.out.println(" do you want make transaction : ");
		   str=sc.next();
		  if(str.equals("yes"))
		  {
			  ui.transaction(cust);
			  System.out.println("after transaction : "+cust.getAobj().getAbal());
		  }
		  System.out.println("wanto make stransation again press 'yes' ");
		  str=sc.next();
		  }while(str.equals("yes"));
	}	
}
