abstract class Shape
{
	public abstract void findarea();
	
}
class  Circle extends Shape
{
	private float r;
	public Circle(float r)
	{
		this.r=r;
	}
	public void findarea()
	{
		float ca=3.14f*r*r;
		System.out.println("Area of circle  : "+ca);
	}
}
class Tringle extends Shape
{
	private float b;
	private float h;
	public Tringle(float b,float h)
	{
		this.b=b;
		this.h=h;
	}
	public void findarea()
	{
		float ta=0.5f*b*h;
		System.out.println("Area of Tringle : "+ta);
	}
}

public class overriding {

	public static void main(String[] args) {
	
		Shape arr[]=new Shape[5];
		
		arr[0]=new Circle(2.5f);
		arr[1]=new Circle(4.5f);
		arr[2]=new Tringle(2.4f,3.5f);
		arr[3]=new Tringle(1.4f,4.5f);
		arr[4]=new Tringle(3.4f,1.5f);
         
		display(arr);
	}
    public static void display(Shape arr[])
    {
    	for(Shape s: arr)
    	{
    		if(s instanceof Circle)
    		{
    			//System.out.println("circle area is ");
    			s.findarea();
    		}
    		if(s instanceof Tringle)
    		{
    			//System.out.println("Trinle are is ");
    			s.findarea();
    		}
    	}
    }
}
