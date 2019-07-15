package exercise15july19;

import java.util.Scanner;

public class ArrayBigSmall {
	private int[] numbers = new int[5];
	private int max=0,i;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		//System.out.println("Enter a numbers");
		for(i=0;i<5;i++)//for(i=0;i<=4;i++)this also used in for loop
		{
			System.out.println("Enter a number for the position : "+i);
			numbers[i]=scan.nextInt();
		}
	}
	public void maximumMinimum()
	{
		int min=numbers[0];
		for(i=0;i<=4;i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
		}	
		for(i=0;i<=4;i++)
		{
			
			if(numbers[i]<min)//if(min<numbers[i])
			{
				min=numbers[i];
			}
		}
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);
	}
}
