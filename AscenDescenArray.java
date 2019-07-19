package exercise18july19;

import java.util.Scanner;

public class AscenDescenArray {
	private int[] elements = new int[10];
	private int[] ascending = new int[10];
	private int[] descending = new int[10];
	private int i,n;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		System.out.println("Enter n value ");
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter a number for the position : "+i);
			elements[i]=scan.nextInt();
		}
	}
	public void changeRbackupCopy()
	{
		for(i=0;i<n;i++)
		{
		ascending[i]=elements[i];
		descending[i]=elements[i];
		}
	}
	public void ascen()
	{
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)//for(int j=i+1;i<=n;j++) put equal to symbol in n before it execute starting ascending order is 0 will display  
			{
				if(ascending[i]>ascending[j])
				{
					int temp=ascending[i];
					ascending[i]=ascending[j];
					ascending[j]=temp;	
				}		
			}
		}
	}
	public void descen()
	{
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(descending[i]<descending[j])
				{
					int temp=descending[i];
					descending[i]=descending[j];
					descending[j]=temp;	
				}		
			}
		}
	}
	public void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Ascending order "+ascending[i]);
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Descending order "+descending[i]);
		}
	}
}
