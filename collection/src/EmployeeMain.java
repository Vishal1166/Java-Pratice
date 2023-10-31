import java.util.List;
import java.util.Scanner;


public class EmployeeMain
{

	public static void main(String[] args)
	{
		EmployeeInfo empinfo= new EmployeeInfo();
		List<Employee> lst=null;
		int ch=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1- Create employee\n2-Display Employee\n3-Search Empoyee\n4-Delete Employee\n5-Insert New Employee\n6-Update Employee\n7-Sort Employee\n8-Employee Details");
		System.out.println(" enter your choice :- ");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			lst=empinfo.createEmployee();
			System.out.println("Employee added...");
			break;
		case 2:
			empinfo.displayEmp(lst);
			break;
		case 3:
			System.out.println("enter eid for search employee : ");
			int empid=sc.nextInt();
			Employee e1= empinfo.searchEmp(lst, empid);
			if(e1!= null)
			{
				System.out.println("Employee Found...");
			}
			else
			{
				System.out.println("Employee not Found...");
			}
			break;
		case 4:
			System.out.println("Enter eid for delete record");
			empid=sc.nextInt();
			empinfo.deleteEmp(lst, empid);
			break;
		case 5:
			break;
		case 6:
			System.out.println("enter eid for update record");
			empid=sc.nextInt();
			System.out.println("enter new salary :");
			double newsal=sc.nextDouble();
			empinfo.updateEmp(lst,empid,newsal);
			break;
		case 7:
			break;
		}		
	}

}
