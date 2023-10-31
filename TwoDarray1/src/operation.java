import java.util.Scanner;

public class operation
{
 
	Scanner sc=new Scanner(System.in);
	
	public int[][] creatmatrix()
	{
		System.out.println("How many row you want : ");
		int r=sc.nextInt();
		int mat1[][]=new int[r][];
		
		for(int i=0;i<mat1.length;i++)
		{
			System.out.println("how many colm yout want "+(i+1)+" row");
			mat1[i]=new int[sc.nextInt()];
		}
		System.out.println("memory allocated...");
		return mat1;	
	}
	
	public int[][] insertmatrix(int mat1[][])
	{
		System.out.println("Enter element  ");
		
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				mat1[i][j]=sc.nextInt();	
	    	}	
		}
		return mat1;
	}
	public void displaymatrix(int mat1[][])
	{
		System.out.println("-------------matrix1---------------");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				System.out.print(mat1[i][j]+" ");	
	    	}	
			System.out.println();
		}
		
	}
	
}
