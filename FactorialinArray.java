package exercise15july19;

import java.util.Scanner;

public class FactorialinArray {
	private int[] elements = new int[5];
	private int[] factorials = new int[5];
	private int i;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<=4;i++)
		{
			System.out.println("Enter a number for the position : "+i);
			elements[i]=scan.nextInt();
		}
	}
/*	public void factorial()
	{	
		for(i=0;i<=4;i++)//for(i=0;i<=4;i++)this also used in for loop
		{
			//int fact[i] = 1;
			fact[i]=fact[i] * elements[i];		
			for(i=0;i<=4;i++)
			{
			System.out.println("Factorial of "+fact[i]);
			}
		}
	}*/	
	public void factorial1()
	{	
		for(i=0;i<=4;i++)
		{
		int fact=1;
		for(int j=1;j<=elements[i];j++)
		{
		fact=fact * j;
		factorials[i]=fact;
		}
		//System.out.println("Factorial of "+fact);
		}
	}
	public void display()
	{
		for(i=0;i<=4;i++)
		{
		System.out.println("Array one named elements["+elements[i]+"] is converted to Array two named factorials["+factorials[i]+"]");
		}
	}

}