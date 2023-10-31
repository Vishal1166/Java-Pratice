import java.util.*;

public class collection1 {

	public static void main(String[] args) {
		
		List<Integer> lst= new LinkedList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(5);
		lst.add(15);
		lst.add(20);
	    lst.add(5);
	    
	    System.out.println("list are :- "+lst);
	    System.out.println(lst.contains(20));     // in list 20 presend or not  ans = true
	    System.out.println(lst.indexOf(20));     //  what is a index no of 20  ans = 1
	    System.out.println(lst.lastIndexOf(20)); // last 20 number kontya positionwr ahe ans = 4
	    System.out.println(lst.remove(1));       // remove element from 1 no position ans = 20
	    System.out.println(lst);
	    System.out.println(lst.size());
	    lst.add(100);
	    lst.add(2, 25);
	    System.out.println(lst);
	    
	    
	    List<Integer>lst2=new ArrayList<Integer>();
	    
	    lst2.add(10);
		lst2.add(5);
		lst2.add(20);
		lst2.add(15);
		lst2.add(20);
	    lst2.add(5);
	    
	    
	    Object arr[] = lst2.toArray();  
	    System.out.println(lst2.subList(2, 4));
	    System.out.println(lst2);
	    
	    
	    Set<Integer> tree= new TreeSet<Integer>();
	    tree.add(10);
	    tree.add(5);
	    tree.add(12);
	    tree.add(20);
	    tree.add(10);
	    tree.add(7);
	    
	    System.out.println("hash set is : "+tree);
	    
	    
	    Set<Integer> hash= new HashSet<Integer>();
	    hash.add(10);
	    hash.add(5);
	    hash.add(12);
	    hash.add(20);
	    hash.add(10);
	    hash.add(7);
	    
	    System.out.println("hash set is : "+hash);
	}
}
