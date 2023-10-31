package com.Vectordemo;

import java.util.Scanner;
import java.util.Vector;

public class BookMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		BookInfo info=new BookInfo();
		Vector<Book> vector=null;
		do
		{
			System.out.println("--------MAIN MENU--------");
		System.out.println("1-Create  record\n2-Display record\n3-Search  record\n4-Delete  record\n5-Insert  record");
		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		  switch(ch)
		   {
			case 1:
				vector=info.Createbook();
				break;
			case 2:
				System.out.println("----------------Display Details------------------");
				info.Display(vector);
				break;
			case 3:
				System.out.println("Enter book id for search record :");
				info.search(vector,sc.nextInt());
				break;
			case 4:
				System.out.println("Enter book id for delete record :");
				info.delete(vector, sc.nextInt());
				break;
			case 5:
				info.insert(vector);
				break;
	       }
		  
		  System.out.println("for main menu press yes : ");
	     }while(sc.next().equals("yes"));
	     System.out.println("--------------------Thank You------------------------");
  }
}
