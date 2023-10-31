
public class app1 {
             // by default we have one thread in program
	         // this thread name is main thread.....
	
	public static void main(String[] args)
	{
		System.out.println("hello thread...");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
System.out.println("-------thank you-------");
	}

}
