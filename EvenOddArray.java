package exercise18july19;

import java.util.Scanner;

public class EvenOddArray {
	private int[] elements = new int[20];
	private int[] odd = new int[20];
	private int[] even = new int[20];
	private int n,i,count=0;
	private int j=0,k=0;
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
	public void evenOdd()
	{
		System.out.println(" 1. Even and Odd Using Array ");
		for(i=0;i<n;i++)
		{
			if(elements[i]%2==0)
			{
				count++;
				even[i]=elements[i];
			//	System.out.println(even[i]);
			//	System.out.println("The even numbers are "+elements[i]);
			}
			else
			{
				odd[i]=elements[i];
				//System.out.println("The odd numbers are "+elements[i]);
			}
			System.out.println("Given numbers "+elements[i]+" Odd numbers "+odd[i]+" Even numbers "+even[i]);
		}
	}
	public void evenOdd1()
	{	
			for(i=0;i<n;i++)
			{
			if(elements[i]%2==0)
			{
				//count++;
				even[j]=elements[i];
				j++;
			//	System.out.println(even[i]);
			//	System.out.println("The even numbers are "+elements[i]);
			}
			else
			{
				odd[k]=elements[i];
				k++;
				//System.out.println("The odd numbers are "+elements[i]);
			}
			//System.out.println("Given numbers "+elements[i]+" Odd numbers "+odd[k]+" Even numbers "+even[j]);
		}	
			
	}
	public void display()
	{
		System.out.println(" 2. Even and Odd Using Array ");
		for(i=0;i<n;i++)
		{
				System.out.println("Given numbers "+elements[i]+" Odd numbers "+odd[i]+" Even numbers "+even[i]);
	
		}
	}
	public void display1()
	{
		System.out.println(" 3. Even and Odd Using Array ");
		for(i=0;i<n;i++)
		{
			if(odd[k]!=0 || even[j]!=0)
			{
				System.out.println("Given numbers "+elements[i]+" Odd numbers "+odd[i]+" Even numbers "+even[i]);
			}
		}
	}
	public void display3()
	{
		for(i=0;i<n;i++)
		{
			if(odd[k]!=0)
			{
				System.out.println("Odd Numbers "+odd[k]);
			}
		}
	}
}
