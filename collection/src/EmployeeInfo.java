import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeInfo {
	
	
	public List<Employee> createEmployee() //1
	{	
		 Scanner sc= new Scanner(System.in);
         List<Employee> lstemp=new ArrayList<Employee>();
		do
		{		
		  System.out.println("enter employee Id , Name , Salary");	
		  Employee emp= new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		  lstemp.add(emp);
				
		System.out.println("Do you want to add more object type yes : -");
		}while(sc.next().equals("yes"));
		return lstemp;
	}
	public void displayEmp(List<Employee> lstemp) //2
	{
		for(Employee e: lstemp)
		{
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getSalary());
		}
	}
	public Employee searchEmp(List<Employee> emplst,int eid) //3
	{
		boolean b=false;
		Employee e1=null;
		for(Employee e:emplst)
		{
			if(e.getEid()==eid)
			{
			b=true;
			e1=e;
			break;
			}
		}
			return e1;		
	}
	public void deleteEmp(List<Employee> lst, int eid) //4
	{
		Employee e=searchEmp(lst,eid);
		if(e!=null)
		{
			lst.remove(e);
			System.out.println("object deleted...");
		}
		else
		{
			System.out.println("Employee not found...");
		}
	}
	public void updateEmp(List<Employee> lst,int eid,double newsal) //5
	{
		Employee e=searchEmp(lst,eid);
		if(e!=null)
		{
			e.setSalary(newsal);
			System.out.println("salary updated...");
		}
	}

}
