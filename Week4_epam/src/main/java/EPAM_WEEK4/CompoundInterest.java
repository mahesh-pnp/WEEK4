package EPAM_WEEK4;

import java.util.Scanner;

public class CompoundInterest {
	public double calCompoundInterest()
	{
		Scanner input = new Scanner(System.in);
		System.out.format("%s","Enter the Principal Amount:\n");
		double principalAmount = input.nextDouble();
		System.out.format("%s","Enter the Number of Years\n");
		double time = input.nextDouble();
		System.out.format("%s","Enter the Rate Of Interest:\n");
		double rateOfInterest = input.nextDouble();
		System.out.format("%s","Specify Compound Interval in Years Format:\n");
		double numberOfCompoundings_PerAnnum = input.nextDouble();
		CompoundInterest compoundObj=new CompoundInterest();
		double compoundInterest = compoundObj.calculate_Compound_Interest(principalAmount,time,rateOfInterest,numberOfCompoundings_PerAnnum);
		return compoundInterest;
	}
	public double calculate_Compound_Interest(double principalAmount,double time,double rateOfInterest,double numberOfCompoundings_PerAnnum)
	{
		return (principalAmount*(Math.pow((1+rateOfInterest/(numberOfCompoundings_PerAnnum*100)),numberOfCompoundings_PerAnnum*time)));
	}
}