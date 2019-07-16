package exercise15july19;

import java.util.Scanner;

public class ReplaceNoinArray {
	private int[] numbers = new int[5];
	private int i,num=0,rep;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<5;i++)//for(i=0;i<=4;i++)this also used in for loop
		{
			System.out.println("Enter a number for the position : "+i);
			numbers[i]=scan.nextInt();
		}
	}
	public void find()
	{
		int check=0;
		System.out.println("Find a number in array ");
		num=scan.nextInt();
		for(i=0;i<5;i++)
		{
			if(num==numbers[i])
			{
				check=1;				
			}
			if(check==0)
			{
				System.out.println("Number is "+num);
			}
			else
			{
				System.out.println("No number is "+num);
			}
		}
	}
	public void replace()
	{
		int temp=num;
		System.out.println("Replace Number ");
		rep=scan.nextInt();
		for(i=0;i<5;i++)
		{
			num=rep;
		}
		System.out.println("number is "+temp+" replace to "+rep);
	}
	public void display()
	{
		
		for(i=0;i<5;i++)
		{
			System.out.println(" Given array ["+numbers[i]+"] Replace numbers "+rep);
		}
		
	}
}
