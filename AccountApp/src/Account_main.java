
public class Account_main {    // main  class   //user see everything
	

	public static void main(String[] args)  
	{
       Accountinfo ai=new Accountinfo();  // class 2 calling here...
		
		Account a[]=ai.create();          // class 1 calling (setter getter )
		ai.display(a);
	}

}
