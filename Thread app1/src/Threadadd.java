
public class Threadadd {

	public static void main(String[] args) {
		
		Calculation c= new Calculation(10, 20);
		
		System.out.println(c.isAlive());   // false ->(thread is not in proccess Q)
		System.out.println(c);
		c.setName("add thread");
		c.start();  // runnable   
		try {
			c.join(); // means child execute first after that main thread execute
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.isAlive());  //true   ->(thread now in Q for proccess)

		 System.out.println("hello");
		 System.out.println("thank you...");
	} 

}

 // when we call start method then  thread shedular call run method (measn shedular getting lineup run method in Q)
