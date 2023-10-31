package com.Vectordemo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class BookInfo
{
	Scanner sc=new Scanner(System.in);
	
	public Vector<Book> Createbook()
	{
		Vector<Book> vecbook=new Vector<Book>();		
		do
		{
			System.out.println("Book id, Book name, Book price :");
			vecbook.add(new Book(sc.nextInt(),sc.next(),sc.nextDouble()));
			
			System.out.println("Do you wanto add  more book press yes :");
		}while(sc.next().equals("yes"));
		return vecbook;
	}
   
	public void Display(Vector<Book> vector)
	{
		Iterator<Book> itr=vector.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			System.out.println(b.getBookid()+"\t"+b.getBookname()+"\t"+b.getBookprice());
		}
	}
	public void search(Vector<Book> vector,int bookid)
	{
		Iterator<Book> itr=vector.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			if(b.getBookid()==bookid)
			{
			System.out.println(b.getBookid()+"\t"+b.getBookname()+"\t"+b.getBookprice());
			break;
			}
		}
		if(itr==null)
		{
			System.out.println("invalid Book id....");
		}
		
	}
	public void delete(Vector<Book> vector,int bookid)
	{
		Iterator<Book> itr=vector.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			if(b.getBookid()==bookid)
			{
			vector.remove(b);
			System.out.println("data deleted....");
			break;
			}
		}
		if(itr==null)
		{
			System.out.println("invalid Book id....");
		}
	}
	public void insert(Vector<Book> vector)
	{
		System.out.println("Enter new book id, book name, book price");
		Book b=new Book(sc.nextInt(),sc.next(),sc.nextDouble());
	    vector.add(0, b);
	    System.out.println("new data inserted");
		
	}
}
