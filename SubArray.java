package exercise15july19;

import java.util.Scanner;

public class SubArray {
	private int[] numbers = new int[10];
	private int[] sub = new int[10];
	private int i;
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
	public void sort()
	{
		int temp=sub[i];
		for(i=numbers[3];i<=numbers[8];i++)
		{
			sub[i]=numbers[i];
		}
	}
	public void display()
	{
		for(i=0;i<=9;i++)
		{
		System.out.println("The given array is numbers["+numbers[i]+"] sub array 3 to 8 sub["+sub[i]+"]");
		}
	}
}
