package javaSamples;

import java.util.Scanner;

public class SumOfDigit {
private int n,sum=0;
Scanner scan = new Scanner(System.in);
public void getInput()
{
	System.out.println("Enter n value");
	n=scan.nextInt();
}
public int sumofDigit()
{
	int sum1=0;
	int count=0;
	while(n>0)
	{
		int re=n%10;
		n++;
		n=n/10;
		sum=sum+re;
		sum1=sum1+1;
		//System.out.println(n+" is Digit");
	}
	System.out.println(+sum1+ "  digit");
	System.out.println("Sum is "+sum);
	return sum;
}
public void sumofDigit1()
{
	SumOfDigit s = new SumOfDigit();
	s.sumofDigit();
	int sum1=0;
	int count=0;
	while(sum>0)
	{
		int re=sum%10;
		sum++;
		sum=sum/10;
		sum1=sum1+re;
		count=count+1;
		//System.out.println(n+" is Digit");
	}
	System.out.println(+count+ "  digit");
	System.out.println("Sum is "+sum1);
}
}
