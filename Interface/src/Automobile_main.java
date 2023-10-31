import java.util.Scanner;

public class Automobile_main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int ch=0;
		Automobile a=null;
		do
		{
		System.out.println("------------Welcome..Cars24------------");
		System.out.println("1-Cars\n2-Bike");
		System.out.println("enter your choice : ");
	    ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("--- car deparment ---");
			System.out.println("1-Maruti\n2-Tata");
			System.out.println("enter your choice : ");
		    ch=sc.nextInt();
			if(ch==1)
			{
			a=new Maruti();
			System.out.println("---------maruti car-------");
			display(a);
			}
			if(ch==2)
			{
				a=new Tata();
				System.out.println("--------tata car----------");
				display(a);	
			}
			break;
		case 2:
			System.out.println("--- Bike deparment ---");
			System.out.println("1-HeroHnda\n2-Bajaj");
			System.out.println("enter your choice : ");
		    ch=sc.nextInt();
		    if(ch==1)
		    {
		    	a=new Herohonda();
				System.out.println("------HeroHonda------------");
				display(a);	
		    }
		    if(ch==2)
		    {
		    	a=new Bajaj();
				System.out.println("---------Bajaj------------");
				display(a);	
		    }
			break;
		}
		System.out.println("Do you want to continue press 1 :");
		ch=sc.nextInt();
		}while(ch==1);
		System.out.println("-------------Thank you...visit again--------------");
	}
       public static void display(Automobile a)
       {
    	System.out.println(a); 
       }
}
