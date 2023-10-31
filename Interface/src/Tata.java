
public class Tata implements Automobile {

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "Tata";
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 900000;
	}
	
	@Override
	public String toString() {
		return "\nModel : " + getname() + "\nColor :" + getcolor() + "\n Price :" + getprice();
	}
}
