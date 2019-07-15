package exercise15july19;

import java.util.Scanner;

public class PositiveNegative {
	private int[] numbers = new int[5];
	private int i;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<5;i++)
		{
			System.out.println("Enter a number for the position : "+i);
			numbers[i]=scan.nextInt();
		}
	}
	public void positNega()
	{
		for(i=0;i<5;i++)
		{
			if(numbers[i]>0)
			{
				System.out.println("The positive numbers are "+numbers[i]+" Position is "+i);
			}
			else
			{
				System.out.println("The negative numbers are "+numbers[i]+" Position is "+i);
			}
		}
	}
	public void positNega1()
	{ 
		int count=0;
		for(i=0;i<5;i++)
		{
			if(numbers[i]>0)
			{
				count++;
				System.out.println("The positive numbers are "+numbers[i]+" Position is "+i);
			}
			//System.out.println("The positive numbers are "+numbers[i]+" times of "+count);
		}
		for(i=0;i<5;i++)
		{
			count=count+1;
			if(numbers[i]<0)
			{
				System.out.println("The positive numbers are "+numbers[i]+" Position is "+i);
			}
			//System.out.println("The negative numbers are "+numbers[i]+" times of "+count);
		}
	}
}
