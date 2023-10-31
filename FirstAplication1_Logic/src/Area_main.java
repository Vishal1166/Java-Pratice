import java.util.Scanner;

public class Area_main {

	public static void main(String[] args) {
		
		Area a=new Area();
		Scanner sc=new Scanner(System.in);
		
		// Circle 
		System.out.println("enter redius of circle : ");
		float r=sc.nextFloat();
		System.out.println("Area of circle = "+a.CArea(r));
		
		// traingle 
		System.out.println("enter base & hight : ");
		float b=sc.nextFloat();
		 float h=sc.nextFloat();
		System.out.println("Area of Trainlge"+a.TArea(b,h));

	}

}
