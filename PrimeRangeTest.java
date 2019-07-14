package javaSamples;

import java.util.Scanner;

public class PrimeRangeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeRange pr = new PrimeRange();
		pr.getInput();
		//pr.findPrimeRange();
		pr.findPrimeRange1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start value");
		int start=scan.nextInt();
		System.out.println("Enter end value");
		int end=scan.nextInt();
		for(int range=start;range<end;range++)
		{
			pr.findPrimeRange2(range);
		}
	}

}
