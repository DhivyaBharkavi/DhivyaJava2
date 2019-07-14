package javaSamples;

import java.util.Scanner;

public class PrimeOrNot {
 int n;
private int check;
 void getInput()
 {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter n value");
	 n=scan.nextInt();
 }
 void findPrimeOrNot()
 {
	 System.out.println(" ");
	 System.out.println("Prime Nubers");
	 int check =0;
	 for(int i=2;i<n;i++)
	 {
		 if(n % i ==0)
		 {
			 check=1;
			 System.out.println("N is "+n+" I is "+i+" Check times is "+check);
		 }
	 }
	 if(check==0)
	 {
		 System.out.println("Prime Number is "+n);
	 }
	 else
	 {
		 System.out.println("Not a prime number is "+n);
	 }
	 }
 void findPrimeOrNot1()
 {
	 System.out.println(" ");
	 System.out.println("Prime Nubers");
	 int check =0;
	 for(int i=2;i<n;i++)
	 {
		 if(n % i ==0)
		 {
			 check=1;
			 System.out.println("N is "+n+" I is "+i+" Check times is "+check);
			 break;
		 }
	 }
	 if(check==0)
	 {
		 System.out.println("Prime Number is "+n);
	 }
	 else
	 {
		 System.out.println("Not a prime number is "+n);
	 }
	 }
 void findPrimeOrNot2()
 {
	 System.out.println(" ");
	 System.out.println("Prime Nubers");
	 int check =0;
	 for(int i=1;i<n;i++)
	 {
		 if(n % i ==0)
		 {
			 check=1;
			 System.out.println("N is "+n+" I is "+i+" Check times is "+check);
			 break;
		 }
	 }
	 if(check==0)
	 {
		 System.out.println("Prime Number is "+n);
	 }
	 else
	 {
		 System.out.println("Not a prime number is "+n);
	 }
	 }
 void findPrimeOrNot3()
 {
	 System.out.println(" ");
	 System.out.println("Prime Nubers");
	 //int check =0;
	// for(int i=1;i<n;i++)
	 for(int i=2;i<n;i++)		
	 {
		 int check =0;
		 if(n % i ==0)
		 {
			 check=1;
			 System.out.println("N is "+n+" I is "+i+" Check times is "+check);
			 break;
		 }
	 }
	 if(check==0)
	 {
		 System.out.println("Prime Number is "+n);
	 }
	 else
	 {
		 System.out.println("Not a prime number is "+n);
	 }
	 }
 void findPrimeOrNot4()
 {
	 System.out.println(" ");
	 System.out.println("Prime Nubers");
	 int check =0;
	 for(int i=2;i<n;i++)
	 {
		// int check =0;
		 if(n % i !=0)
		 {
			 check=1;
			 System.out.println("N is "+n+" I is "+i+" Check times is "+check);
			 break;
		 }
	 }
	 if(check==0)
	 {
		 System.out.println("Prime Number is "+n);
	 }
	 else
	 {
		 System.out.println("Not a prime number is "+n);
	 }
	 }

}
