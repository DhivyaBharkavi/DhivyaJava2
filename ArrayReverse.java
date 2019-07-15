package exercise15july19;

import java.util.Scanner;

public class ArrayReverse {
	private int[] numbers = new int[10];
	private int[] reverse = new int[10];
	private int i;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		//System.out.println("Enter a numbers");
		for(i=0;i<10;i++)//for(i=0;i<=4;i++)this also used in for loop
		{
			System.out.println("Enter a number for the position : "+i);
			numbers[i]=scan.nextInt();
		}
	}
	public void reverse()
	{
		/*for(i=0;i<10;i++)
		{*/
			for(i=9;i>=0;i--)
			{
				int temp=numbers[i]%10;
				reverse[i]=(reverse[i]*10)+temp;
				numbers[i]=numbers[i]/10;
			}
			System.out.println("Reverse array "+reverse[i]);
		//}
	}
	public void reverse1()
	{
		for(i=9;i>=0;i--)
		{
			reverse[i]=numbers[i];
			System.out.println("Reverse array "+reverse[i]);
			System.out.println("User Store Array["+numbers[i]+"] is Reverse Array ["+reverse[i]+"]");
		}	
	}
	public void display()
	{
		
	}
}
