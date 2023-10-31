import java.util.Scanner;

public class AccountUi {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do
		{
		System.out.println("1-Saving Acoount\n2-Current Account ");
		System.out.println("Enter your choice -");
	     ch=sc.nextInt();
		if(ch==1)
		{
			Saving s=new Saving(101, "Saving", 10000, 6);
			display(s);
		}
		if(ch==2)
		{
			Current c=new Current(201, "Current", 25000, "abc");
			display(c);
		}
		System.out.println("Do you want to continue press 1 : ");
		ch=sc.nextInt();
		}while(ch==1);
	}
		public static void display(Account a)
		{
			System.out.println("Account no     : "+a.getAcno());
			System.out.println("Account type   : "+a.getActype());
			System.out.println("Account balace : "+a.getAcbal());
			if(a instanceof Saving)
			{
				Saving s=(Saving)a;
				System.out.println("intrest rate   : "+s.getIntrest());	
			}
			if(a instanceof Current)
			{
				Current c=(Current)a;
				System.out.println("Company name   : "+c.getConame());
			}
		}
	

}
