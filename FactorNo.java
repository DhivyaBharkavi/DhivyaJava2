package exercise12july19;

import java.util.Scanner;

public class FactorNo {
private int n;
public void getInput()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value");
	n=sc.nextInt();
}
public void formatNo()
{
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println("Divisible by "+i);
		}
	}
}
}
