package exercise12july19;

import java.util.Scanner;

public class PressQ {
	private int n,i,sum=0,average;
	Scanner sc = new Scanner(System.in);
	public void getInput()
	{
		
		System.out.println("Enter n value");
		
		n=sc.nextInt();
		
	}
	public void process()
	{
		int check=0;
		if(check==0)
		{	
			for(i=1;i<n;i++)
			{
				n=sc.nextInt();
				System.out.println("Do you want to continue(y/q)");
			}
			check = 1;
			/*char c = 0;
			if(c=='q')*/
			System.out.println("Exit");
			sum=sum+n;
			average=average/sum;
		}	
		
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);
	}
}
	

