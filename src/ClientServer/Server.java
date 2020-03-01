package ClientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String args[]) throws IOException
	{
		int area,temp=0,standard,automated;
		ServerSocket s1=new ServerSocket(1234);
		Socket ss=s1.accept();
		Scanner scan=new Scanner(ss.getInputStream());
		area=scan.nextInt();
		standard=scan.nextInt();
		automated=scan.nextInt();
		if(standard==1 && automated==0)
			temp=area*1200;
		else if(standard==2 && automated==0)
			temp=area*1500;
		else if(standard==3 && automated==0)
			temp=area*1800;
		else if(standard==3 && automated==1)
			temp=area*2500;
		else
			exception.InputException.printErrorMessage();
		PrintStream p=new PrintStream(ss.getOutputStream());
		p.println(temp);
		p.println(standard);
		p.println(automated);
		interest.SimpleInterest.SI(temp);
		interest.CompoundInterest.CI(temp);
	}
}
