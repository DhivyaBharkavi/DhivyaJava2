package exercise9july19;

import java.util.Scanner;

public class Digit2or3or4 {
	int n;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter n value");
		n=scan.nextInt();
	}
	void digit()
	{
		if(n<9 || n<-9)
		{
			System.out.println("One Digit " +n);
		}
		else if((n>10 && n<99)||(n>10)&&(n<-99))
		{
			System.out.println("Two Digit " +n);
		}
		else if(n>100 && n<999)
		{
			System.out.println("Three Digit "+n);
		}
		else if(n>1000 && n<9999)
		{
			System.out.println("Four Digit "+n);
		}
		else
		{
			System.out.println("No Digit "+n);
		}
		
}
	void digit1()
	{
		int count = 0;
		while(n>0 || n<0)
		{
			//n=n%10;
			n=n/10;
			System.out.println(n+ " Digit");
			count = count + 1;
			//n++;
			
		}
		System.out.println(count+" Digit ");
		//n++;
	}
}
