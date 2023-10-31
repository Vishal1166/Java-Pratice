
public class InvalidBalException extends Exception 
{
   private double bal;
   public InvalidBalException(double bal)
   {
	   this.bal=bal;
   }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "your acc bal<1000";
}
   
}
