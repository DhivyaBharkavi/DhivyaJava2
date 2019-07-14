package javaSamples;

import java.util.Scanner;

public class PrimeRange {
	private int n,m;
	public void getInput()
	 {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter n value");
		 n=scan.nextInt();
		 System.out.println("Enter m value");
		 m=scan.nextInt();
	 }
	 public void findPrimeRange()
	 {
		 System.out.println(" ");
		 System.out.println("Prime Range");
		 //int check =0;
		 for(int i=n;i<m;i++)
		 {
			// int check =0;
			 if(m % i ==0)
			 {
				// check=1; 
				 System.out.print(i+"\t");
				 //System.out.println("N is "+n+" I is "+i+" Check times is "+check);
				 //break;
			 }
		 }
	 }	 
		 void findPrimeRange1()
		 {
			 System.out.println(" ");
			 System.out.println("Prime Range");
			 for(int j=n;j<m;j++)//n is a starting poing and m is a ending point 
			 {
			 int check =0; 
			 for(int i=2;i<j;i++)//n is 
			 {
				 if(j % i ==0)
				 {
					 check=1;
					//System.out.print(j+"\t");
					 break;
					// System.out.println("N is "+n+" I is "+i+" Check times is "+check);
				 }
			 }
			 if(check==0)
			 {
				 System.out.println("Prime Numbers "+j+"\t");
				 //System.out.print(" ");
				 //System.out.print(j+"\t");
			 }
			 else
			 {
				 System.out.println("Not a prime number  "+j+"\t");
				 //System.out.print(" ");
				 //System.out.print(j+"\t");
			 }
			 }
		 }
		 void findPrimeRange2(int n)
		 {
			 System.out.println(" ");
			 System.out.println("Prime Range");
			 int check =0; 
			 for(int i=2;i<n;i++)//n is 
			 {
				 if(n % i ==0)
				 {
					 check=1;
					//System.out.print(j+"\t");
					 break;
					// System.out.println("N is "+n+" I is "+i+" Check times is "+check);
				 }
			 }
			 if(check==0)
			 {
				 System.out.println("Prime Numbers "+n+"\t");
				 //System.out.print(" ");
				 //System.out.print(j+"\t");
			 }
			 else
			 {
				 System.out.println("Not a prime number  "+n+"\t");
				 //System.out.print(" ");
				 //System.out.print(j+"\t");
			 }
			 }
		 }
		 


