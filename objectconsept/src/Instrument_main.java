
public class Instrument_main {

	public static void main(String[] args) {
		
		Instrument arr[]=new Instrument[5];
      arr[0]=new Guitar();
      arr[1]=new Piano();
      arr[2]=new Fluet();
      arr[3]=new Piano();
      arr[4]=new Guitar();
      
      display(arr);
	}
 public static void display(Instrument arr[])
 {
	 for(Instrument i: arr)
	 {
		 if(i instanceof Guitar)
		 {
			 System.out.println("Guitar playing..");
			 i.play();
		 }
		 if(i instanceof Piano)
		 {
			 System.out.println("Piano playing..");
		      i.play();
		 }
		 if(i instanceof Fluet)
	     {
		  System.out.println(" Fluet playing...");
			  i.play();
		 }
	 }
 }
}
