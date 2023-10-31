class demo
{   // this is a var args example 
	public void display(int ...n1)
	{//... means array
	System.out.println("function call with no of argument "+n1.length);
	
	  for(int i:n1)
	  {
		System.out.println(i);
	  }
	}
	// one float and many no of integer 
	public void show(float f,int ...n)
	{
	System.out.println("function call float  "+f+"  function int many integer"+n.length);	
	for(int i:n)
	{
		System.out.println(i);
	}
	}
}
public class varargsexample {

	public static void main(String[] args) {
		
       demo d=new demo();
       
       d.display();
       d.display(10,20);
       d.display(10,20,30);
       
       System.out.println("----------------------------------");
       
       d.show(1.1f);
       d.show(1.1f,10);
       d.show(1.1f,10,20,30,40);
	}

}
