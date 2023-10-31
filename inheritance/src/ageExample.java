class Grandfather
{
	private int gage;
	public Grandfather(int gage)
	{
		this.gage=gage;
	}
	public void showage()
	{
		System.out.println("grandfather age : "+gage);
	}
}
class Father extends Grandfather
{
	private int fage;
	public Father(int fage)
	{
		super(fage+30);
		this.fage=fage;
	}
	public void showage()
	{
		super.showage();
		System.out.println(" father age : "+fage);
	}		
}
class Son  extends Father
{
	private int sage;
	public Son(int sage)
	{
		super(sage+30);
		this.sage=sage;
	}
	public void showage()
	{
		super.showage();
		System.out.println("son age : "+sage);
	}
}

public class ageExample
{
   public static void main(String[] args)
	{
	   Son s=new Son(20);
	   s.showage();
	   System.out.println("---------------Thank you-------------------");
	}
}
