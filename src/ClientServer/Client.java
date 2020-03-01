package ClientServer;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		int area,temp,standard2,automated2;
		Scanner scan=new Scanner(System.in);
		Socket s=new Socket("127.0.0.1",1234);
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        myout.println("enter the area:");
		Scanner serverScan=new Scanner(s.getInputStream());
		area=scan.nextInt();
		myout.println("please choose standard of materials...enter your choice(1,2,3):");
		myout.println("1.standard material");
		myout.println("2.above Standard material");
		myout.println("3.high standard material");
		int standard=scan.nextInt();
		myout.println("please enter '1' if you want fully automated house else '0'");
		int automated=scan.nextInt();
		PrintStream p= new PrintStream(s.getOutputStream());
		p.println(area);
		p.println(standard);
		p.println(automated);
		System.out.println(area);
		System.out.println(standard);
		System.out.println(automated);
	}
}
