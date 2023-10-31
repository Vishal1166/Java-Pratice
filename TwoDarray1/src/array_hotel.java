import java.util.Scanner;

public class array_hotel {

	public static void main(String[] args) {
		int k=0,ono=0;
		int order[]=new int[10];
		Scanner sc=new Scanner(System.in);
		
		String vegmenu[]= {"paneer masala","kagu karry","pav bhaji","bhendi fry"};
		int  menuprice[]= {200,250,150,100};
		do
		{
		System.out.println("-------------------Hotel APP-----------------");
		System.out.println("order no\tvegmenu\t\t\tprice\n");
		for(int i=0;i<vegmenu.length;i++)
		{
			System.out.println((i+1)+"\t\t"+vegmenu[i]+"\t\t"+menuprice[i]);
		}
		System.out.println("please enter order no : ");
		 ono=sc.nextInt();
		 order[k]=ono;
		 k++;
	System.out.println("Do you want to order again...press 1 : ");
	}while(sc.nextInt()==1);
	
		float total=0,sgst=0,cgst=0,finaltotal=0;
	// bill calculation
		for(int i=0;i<k;i++)
		{
			total=total+menuprice[order[i]-1];
		}
		cgst=total*0.06f;
		sgst=total*0.06f;
		finaltotal=total+cgst+sgst;
		
		System.out.println("--------------------BIll---------------------");
		
		System.out.println("----your order---- ");
		for(int i=0;i<k;i++)
		{
			System.out.println(vegmenu[order[i]-1]+"\t"+menuprice[order[i]-1]);
		}
		
		System.out.println("\nTotal\t    : "+total);
		System.out.println("CGST\t    : "+cgst);
		System.out.println("SGST\t    : "+sgst);
		System.out.println("Final total : "+finaltotal);
		System.out.println("-----------THANK YOU...Visit Again-------------");
	}

}
