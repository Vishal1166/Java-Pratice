import java.net.*;
import java.io.*;

public class Myserver
{
	public Myserver() throws Exception
	{
		ServerSocket ss=new ServerSocket(1234);
		Socket s=null;
		while(true)
		{
			System.out.println("Server started ..wating for client..");
			s=ss.accept();
			System.out.println("Got Client "+s.getInetAddress().toString());
			
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str=br.readLine();
			System.out.println("Client "+str);
		}
	}

	public static void main(String[] args) throws Exception
	{
	  new Myserver();

	}

}
