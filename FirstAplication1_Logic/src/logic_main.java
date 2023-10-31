import java.util.Scanner;

public class logic_main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        logic l=new logic();
   	    int ch=0,n;
        do
        {
        	System.out.println("1-Factor\n2-Factorial\n3-Power\n4-Prime no\n5-reverse\n6-sumofdigit");
        	System.out.println("Enter your chice : ");
              ch=sc.nextInt();
           
              switch(ch)
              {
              case 1:
            	  System.out.println("Enter any number for factor : ");
            	  n=sc.nextInt();
            	  l.factor(n);
            	  break;
              case 2:
            	  System.out.println("enter any num for factorial : ");
            	  System.out.println("factorial num is ="+l.factorial(sc.nextInt()));
            	  break;
              case 3:
            	  System.out.println("enter base and power : ");
            	  int b=sc.nextInt();
            	  int p=sc.nextInt();
            	  System.out.println("power is "+l.power(b,p));
            	  break;
              case 4:
            	  System.out.println("enter any number : ");
            	  if(l.prime(sc.nextInt()))
            	  {
            		  System.out.println(" given number is prime no");
            	  }
            	  else
            	  {
            		  System.out.println("Not a prime number ");
            	  }
            	  break;
              case 5:
            	  System.out.println("enter any number : ");
            	  l.reverse(sc.nextInt());
            	  break;
              case 6:
            	  System.out.println("enter any number : ");
            	  System.out.println("sum of number is "+l.sumofdigit(sc.nextInt()));
            	  break;
            	  
              }
        	System.out.println("\nif you want to continue press 1 :");
        	ch=sc.nextInt();
        }while(ch==1);
        System.out.println("------------THANK YOU------------------");
	}

}
