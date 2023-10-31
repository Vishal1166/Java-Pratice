
public class Calculation extends Thread
{
	private int no1;
	private int no2;
	
	public Calculation(int no1, int no2)
	{
		
		this.no1 = no1;
		this.no2 = no2;
	}
		
	public void run() // running     (thread shedular will call the run method )
	{
		System.out.println(" i am runnung...here ");
		getsum();
	}  // thread is dead here..
	
   public void getsum()
   {
	 System.out.println("calling add method");
	 int add=no1+no2;
	 System.out.println("Addintion "+add);
   }
}
