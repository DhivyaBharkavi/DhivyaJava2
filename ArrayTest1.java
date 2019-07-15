package exercise15july19;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean b =true;
		while(b)
		{
		System.out.println("Menu");
		System.out.println("1. Factorial");
		System.out.println("2. Positive or Negative");
		System.out.println("3. Reverse an array");
		System.out.println("Enter your choice ");
		int choice=scan.nextInt();
		if(choice==1)
		{
		FactorialinArray fa = new FactorialinArray();
		fa.getInput();
		//fa.factorial();
		fa.factorial1();
		fa.display();
		}
		else if(choice==2)
		{
		PositiveNegative pn = new PositiveNegative();
		pn.getInput();
		//pn.positNega();
		pn.positNega1();
		}
		else if(choice==3)
		{
			ArrayReverse av = new ArrayReverse();
			av.getInput();
			//av.reverse();
			av.reverse1();
			av.display();
		}
	}
}
}