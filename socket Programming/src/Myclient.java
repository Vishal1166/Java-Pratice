import java.net.*;
import java.io.*;

public class Myclient
{
Socket s;
String cname;

 public Myclient(String cname) throws Exception
{
	s=new Socket("localhost",1234);
	
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	String str=br.readLine();
	
	PrintWriter pw=new PrintWriter(s.getOutputStream());
	pw.println(cname+" : "+str);
	System.out.println(pw.checkError());
}
	
	public static void main(String[] args) throws Exception
	{
		Myclient m=new Myclient();
		
	}

}
