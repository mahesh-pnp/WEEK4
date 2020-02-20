package EPAM_WEEK4;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class App {
	static Scanner input;
	public static void main(String args[]) {
		System.out.format("%s","Enter \'simple\' for simple interest or \'compound\' for compound interest:\n");
		input=new Scanner(System.in);
		String ch=input.nextLine();
		switch(ch)
		{
			case "simple":
				SimpleInterest simpleInterest=new SimpleInterest();
			System.out.format("%.4f",simpleInterest.calSimpleInterest());break;
			case "compound":
				CompoundInterest compoundInterest=new CompoundInterest();
				System.out.format("%.4f",compoundInterest.calCompoundInterest());break;
				default:
					System.out.format("%s","\nInvalid option");break;
					}
		
	}
	

}