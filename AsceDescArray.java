package exercise18july19;

import java.util.Scanner;

public class AsceDescArray {
	private int[] elements = new int[5];
	private int[] ascending = new int[5];
	private int[] descending = new int[5];
	private int i;
	Scanner scan =new Scanner(System.in);
	public void getInput()
	{
		for(i=0;i<=4;i++)
		{
			System.out.println("Enter a number for the position : "+i);
			elements[i]=scan.nextInt();
		}
	}
	public void asce()
	{
		for(i=0;i<=4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
			if(elements[i]>elements[j])
			{
				System.out.println(i);
				int temp=elements[i];
				elements[i]=elements[j];
				elements[j]=temp;
				//ascending[i]=temp;
				System.out.println("Ascending order "+temp);
			}
			
		}
			
	}
	}
}
