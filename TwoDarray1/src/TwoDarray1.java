import java.util.Scanner;

public class TwoDarray1 {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
       System.out.println("how many rows do you want : ");  // allocation for  row
       int r=sc.nextInt();
       int arr[][]=new int[r][];
       
       
       System.out.println("Enter a colm for each rows : "); // allocation colm for each row
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println("Enter colm for "+(i+1)+" row : ");
    	   int c=sc.nextInt();
    	   arr[i]=new int[c]; 
       }                       // after this loop memory allocated like you want...
       
       
                                    // Insert Elements in two D array
       System.out.println("Enter elements for matrix1 :");
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=0;j<arr[i].length;j++)
    	   {
    		   arr[i][j]=sc.nextInt();
    	   }
       }
       
       System.out.println("-----------Matrix1-------------");
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=0;j<arr[i].length;j++)
    	   {
    		   System.out.println(arr[i][j]+"  ");
    	   }
    	   System.out.println();
       }
       
	}	
}
