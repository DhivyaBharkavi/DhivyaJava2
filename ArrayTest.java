package exercise15july19;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean b =true;
		while(b)
		{
		System.out.println("Menu");
		System.out.println("1. Find position and number of times in elements");
		System.out.println("2. Maximum and minimum numbers");
		System.out.println("Enter your choice ");
		int choice=scan.nextInt();
		if(choice==1)
		{
		Array a = new Array();
		a.getInput();
		a.sumAverage();
		a.findElementPosition();
		//a.display();
		}
		else if(choice==2)
		{
		ArrayBigSmall ab = new ArrayBigSmall();
		ab.getInput();
		ab.maximumMinimum();
		}
		}	
}
}