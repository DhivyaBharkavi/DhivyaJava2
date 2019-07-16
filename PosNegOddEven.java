package exercise15july19;

import java.util.Scanner;

public class PosNegOddEven {
	private int[] numbers = new int[20];
	private int i,count=0,count1=0,count2=0,count3=0,count4=0;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		//System.out.println("Enter a numbers");
		for(i=0;i<=9;i++)//for(i=0;i<=4;i++)this also used in for loop
		{
			System.out.println("Enter a number for the position : "+i);
			numbers[i]=scan.nextInt();
		}
	}
	public void findAll()
	{
		for(i=0;i<=9;i++)
		{
			if(numbers[i]>0)
			{
				count++;
				System.out.println("The positive numbers are "+numbers[i]);
			}
			else if(numbers[i]<0)
			{
				count1++;
				System.out.println("The negative numbers are "+numbers[i]);
			}
			else if(numbers[i]%2==0)
			{
				count2++;
				System.out.println("The even numbers are "+numbers[i]);
			}
			else if(numbers[i]%2!=0)
			{
				count3++;
				System.out.println("The odd numbers are "+numbers[i]);
			}
			else if(numbers[i]==0)
			{
				count4++;
				System.out.println("The zero numbers are "+numbers[i]);
			}
			
		}
	}
	public void findPositive()
	{
		for(i=0;i<=9;i++)
		{
			if(numbers[i]>0)
			{
				count++;
				System.out.println("The positive numbers are "+numbers[i]);
			}
		}
	}
	public void findNegative()
	{
		for(i=0;i<=9;i++)
		{
			if(numbers[i]<0)
			{
				count1++;
				//System.out.println("The negative numbers are "+numbers[i]);
			}
		}
	}
	public void findOdd()
	{
		for(i=0;i<=9;i++)
		{
			if(numbers[i]%2!=0)
			{
				count2++;
				System.out.println("The odd numbers are "+numbers[i]);
			}
		}
		
	}
	public void findEven()
	{
		for(i=0;i<=9;i++)
		{
			if(numbers[i]%2==0)
			{
				count3++;
				System.out.println("The even numbers are "+numbers[i]);
			}
		}
	}
	public void findZero()
	{
		for(i=0;i<=9;i++)
		{
			if(numbers[i]==0)
			{
				count4++;
				System.out.println("The zero numbers are "+numbers[i]);
			}
		}
	}
	public void display()
	{
		System.out.println("The positive numbers are "+count);
		System.out.println("The negative numbers are "+count1);
		System.out.println("The odd numbers are "+count2);
		System.out.println("The even numbers are "+count3);
		System.out.println("The zero numbers are "+count4);
	}
	
}
