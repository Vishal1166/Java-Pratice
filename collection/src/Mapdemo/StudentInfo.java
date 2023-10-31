package Mapdemo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentInfo
{
	Scanner sc=new Scanner(System.in);
	public Map<String, Student> createMap()
	{
		Map<String, Student> studmap=new HashMap<String, Student>();     // in randome order
	//	Map<String, Student> studmap=new TreeMap<String, Student>();    //in  sorting order
		do
		{
			System.out.println("student rno for key, student name, marks for three subject ");
			studmap.put(sc.next(),new Student(0,sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
			
		System.out.println("Do you wanto countinue again press yes : ");
		}while(sc.next().equals("yes"));
		return studmap;
	}

	public void displayMap(Map<String, Student> smap)
	{
		Set<String> st=smap.keySet();
		for(String s: st)
		{
			Student stud=smap.get(s);
			System.out.println("key :"+s+"\t"+stud.getSname()+"\t"+stud.getSub1()+"\t"+stud.getSub2()+"\t"+stud.getSub3());
		}
	}
}
