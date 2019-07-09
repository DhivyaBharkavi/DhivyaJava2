package exercise9july19;

import java.util.Scanner;

public class Divisible5and11 {
	int n;
	Scanner scan = new Scanner(System.in);

	void getInput() {
		System.out.println(" ");
		System.out.println("===========================================");
		System.out.println(" A Number is divisible by 5 and 11 or Not ");
		System.out.println("===========================================");
		System.out.println("Enter n value");
		n = scan.nextInt();
	}

	void divisible() {

		if (n % 5 == 0 && n % 11 == 0) {
			//if (n % -5 == 0 && n % -11 == 0)
			{
				System.out.println(n + " is divisible by 5 and 11  ");
			//}
		} else {
			System.out.println(n + " is not divisible by 5 and 11 ");
		}
	}
	/*
	 * void divisible1() {
	 * 
	 * if(n%5==0) { System.out.println(n+" is divisible by 5   "); } else
	 * if(n%11==0) { System.out.println(n+" is divisible by 11   "); } else {
	 * System.out.println(n+" is not divisible by 5 and 11 "); } }
	 */
	/*
	 * void divisible2() {
	 * 
	 * if(n%5==0 || n%11==0) {
	 * System.out.println(n+" is divisible by 5 and 11 is "); }
	 * 
	 * else { System.out.println(n+" is not divisible by 5 and 11 "); } }
	 */
}
