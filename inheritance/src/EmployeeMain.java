
public class EmployeeMain 
{

	public static void main(String[] args) 
	{		
		Manager m1=new Manager(101,"vishal", 10000, 3000);
		Devloper d1=new Devloper(201, "suresh", 20000, 15);
         display(m1);
         System.out.println("-----------------------");
         display(d1);
	}   
         public static void display(Employee e)
         {
        	System.out.println("ID         :"+e.getEid());
        	System.out.println("Name       :"+e.getEname());
        	System.out.println("Salary     :"+e.getEsal());
        	
             if(e instanceof Manager)
             {
            	 Manager m=(Manager)e;
            	 System.out.println("Bonus\t   :"+m.getBonus());
             }
             if(e instanceof Devloper)
             {
            	 Devloper d=(Devloper)e;
            	 System.out.println("noof hour  :"+d.getNoofhr());
             }
	     }
}
