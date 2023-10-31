
public class Accountobject {

	public static void main(String[] args) {
		
		Account2 acc1=new Account2(101,"vishal",10000);
		Account2 acc2=new Account2(101,"vishal",10000);
		
		System.out.println(acc1);
		System.out.println(acc2);
		
    
     if(acc1.equals(acc2))
     {
    	System.out.println("object are same.."); 
     }
     else
     {
    	 System.out.println("object are differnce");
     }
    // acc1=null;        
     System.gc();    // if want to detroy then call system.gc
     System.out.println("thanks main...");
}
}