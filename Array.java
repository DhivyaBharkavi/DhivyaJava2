package exercise15july19;

import java.util.Scanner;

public class Array {
	private int[] numbers = new int[5];
	private int sum=0,i,average;
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
	public void sumAverage()
	{
		for(int j=0;j<5;j++)
		{
			sum=sum+numbers[j];
			average=sum/numbers[j];
		}
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);
	}
	public void findElementPosition()
	{
		int num=0,count=0,check=0,k;
		System.out.println("Enter a number");
		num=scan.nextInt();
		for(k=0;k<5;k++)
		{
			//if(numbers[k]==num)
			if(num==numbers[k])
			{
				count++;//count=count+1;
				check=1;		
			}	
			if(check==1)
			{
				System.out.println("The number is found in the array "+num);	
			}
			else
			{
				System.out.println("The number is not found in the array "+num);
			}
			System.out.println("The number  "+num+" of times "+count+" Position is "+k);
		}	
			
		}

	public void display()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Given numbers " +numbers[i]+" Position is numbers["+i+"]");
		}
	}
}
