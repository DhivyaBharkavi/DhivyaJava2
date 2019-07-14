package exercise14july19;

import java.util.Scanner;

public class FibonacciPattern {
	private int n,f=0,s=1;
	void getInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		n=scan.nextInt();
	}
	void patternfib()
	{
		System.out.println(f+"\n"+s);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;i++)
			{
			System.out.print(j);
			}
			s=f+s;
			f=s-f;
			System.out.println();
			/*System.out.println(s+"\t");
			System.out.println(s+"\t");
			*/
		}
	}
		//+(s-1));
		//System.out.println(s+"\t"+(s-));
		//System.out.println(s+"\t"+(s-1));

		
	
}
