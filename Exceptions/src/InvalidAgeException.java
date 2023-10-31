
public class InvalidAgeException extends Exception 
{
	private int age;
	public InvalidAgeException(int age)
	{
	this.age=age;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " your age < 18";
	}

}
