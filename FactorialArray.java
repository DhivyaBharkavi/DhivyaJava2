package exercise18july19;

import java.util.Scanner;

public class FactorialArray {
	private int[] elements = new int[10];
	private int[] factorials = new int[10];
	private int n,i;
	Scanner scan = new Scanner(System.in);
	public void getInput()
	{
		System.out.println("Enter n value");
		n=scan.nextInt();
	for( i=0;i<n;i++)
	{
		System.out.println("Enter an elements  "+i);
		elements[i]=scan.nextInt();
	}
	}
	public void findfacts()
	{
		for( i=0;i<n;i++)
		{
			int fact=1;
			for(int j=1;j<=elements[i];j++)
			{
				fact=fact * j;
			}
			factorials[i]=fact;
		}
	}
	public void printArray()
	{
		for(i=0;i<n;i++)
		{
		System.out.println(elements[i]+" "+factorials[i]);
		}
	}
		
}
