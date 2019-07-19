package exercise19july19;

import java.util.Scanner;

public class SumOfDigitArray {
	private int[] elements = new int[10];
	private int[] sum1 = new int[10];
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
	public void sum()
	{
		int sum=0,re=0,temp=elements[i];
		for(i=0;i<n;i++)
		{
		while(elements[i]>0)
		{
			re=elements[i]%10;
			elements[i]=elements[i]/10;
			sum=sum+elements[i];
		}
		sum1[i]=sum;
	System.out.println("Sum is "+sum1[i]);
	System.out.println("Result "+re);
		}
	/*if(temp%sum==0)
	{
		//System.out.println(sum);
		System.out.println("Output : Yes");
	}
	else 
	{
		System.out.println("Output : No");
	}*/
	}
}
