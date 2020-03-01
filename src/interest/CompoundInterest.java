package interest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CompoundInterest {
	public static void CI(double cost)
	{
		double amount=0;
		double rate=0.05;
		double time=1;
		double n=12;
		/*If an cost is deposited into a savings account at an annual 
		 * interest rate of 1%, compounded monthly, the value of the investment 
		 * after 1 years can be calculated as follows...*/
		amount=cost*Math.pow((1+rate/n),n*time);
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        myout.print("the compound interest at rate 5% compounded monthly over year is: ");
        myout.println(amount);
	}
}
