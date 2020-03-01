package interest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SimpleInterest {
	public static void SI(double cost) {
		double amount=0;
		double rate=0.05;
		double time=1;
	    amount=cost+cost*rate*time;
		//this is the total amount we get at the rate of 1% interest over a duration of 1year
	    PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        myout.print("the simple interest at rate 5% over a year is: ");
        myout.println(amount);
	}
}
