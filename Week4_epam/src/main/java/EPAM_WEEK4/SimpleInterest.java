package EPAM_WEEK4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleInterest {
	public double calSimpleInterest()
	{
	Scanner input = new Scanner(System.in);
	PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("Enter Principal Amount:\n");
		double principalAmount = input.nextDouble();
		myout.print("Enter the Number of Years:\n");
		double time = input.nextDouble();
	     myout.print("Enter Rate Of Interest:\n");
		double rateOfInterest = input.nextDouble();
		SimpleInterest simpleObj=new SimpleInterest();
		double simpleInterest = simpleObj.calculate_Simple_Interest(principalAmount,time,rateOfInterest);
	
		return simpleInterest;
		}
	public double calculate_Simple_Interest(double principalAmount,double time,double rateOfInterest)
	{
		return principalAmount*time*rateOfInterest/100;
	}
}