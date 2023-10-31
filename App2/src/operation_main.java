import java.util.Scanner;

public class operation_main {

	public static void main(String[] args) {
		
		operation o=new operation();
		Scanner sc=new Scanner(System.in);
		int arr[]=null;
		int ch=0,elm;
		do
		{
		System.out.println("1-Creat Array\n2-Insert Array\n3-Display Array\n4-Search Element\n5-Sorting Element");
		System.out.println("Enter your choice : ");
		 ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			arr=o.creatArray();
			System.out.println("Array is created...");
			break;
		case 2:
			System.out.println("Enter elemnts : ");
			o.insertele(arr);
			break;
		case 3:
			 o.displayele(arr);
			break;
		case 4:
			System.out.println("Enter element to search in array : ");
			elm=sc.nextInt();
			o.search(elm, arr);
			break;
		case 5:
			o.sort(arr);
			System.out.println("sorting complete...");
			break;
		}
		System.out.println("Do you wnat to continue.. ");
		ch=sc.nextInt();
		}while(ch==1);
       System.out.println("------------THANK YOU-------------------");
	}

}
