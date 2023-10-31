
public class logic {
	
	public void factor(int n)
	{
		System.out.println("factorial number is : ");
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
	}
	public int factorial(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	public int power(int b,int p)
	{
		int ans=1;
		for(int i=1;i<=p;i++)
		{
			ans=ans*b;
		
		}
		return ans;
	}
	public  boolean prime(int n)
	{
		boolean b=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
	public void reverse(int n)
	{
		int r=0;
		System.out.println("reverse number is : ");
		do
		{
			r=n%10;
				System.out.print(r);
					n=n/10;
		}while(n!=0);
	}
	public int sumofdigit(int n)
	{
		int r=0,ans=0;
		do
		{
			r=n%10;
			ans=ans+r;
			n=n/10;
		}while(n!=0);
		return ans;
	}

}
