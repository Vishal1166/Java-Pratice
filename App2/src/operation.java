import java.util.Scanner;

public class operation {
	
	Scanner sc=new Scanner(System.in);
	int arr[];
	
	public int[] creatArray()
	{
		System.out.println("how many element do you want to print : ");
		int n=sc.nextInt();
		arr=new int[n];  // allocate memory for first 5 elements
		return arr;
	}
	
	public void insertele(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
		
	public void displayele(int arr[])
	{
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}
	
	public void search(int elm,int arr[])
	{
		boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==elm)
			{
				b=true;
				break;
			}			
		}
		if(b)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element Not found...");
		}
	}
	public void sort(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
	}

}
