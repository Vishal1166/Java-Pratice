import java.util.Scanner;

public class ArraybasicApp {

	public static void main(String[] args) {
		
		int arr[];
		arr =new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements is array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*System.out.println("array element in revers ");
		for(int i=arr.length-1;i>=0;i--)        // this is for print elem in reverse method 
		{
			System.out.print(arr[i]+"\t");
		}*/
		System.out.println("Element in array are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("using for each loop...");
		for(int i:arr)                            // thi is method is java  for print element in arrays(java onwords..)
		{
			System.out.println(i);	
		}

	}

}
