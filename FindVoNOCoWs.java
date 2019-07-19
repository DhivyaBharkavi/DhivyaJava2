package exercise19july19;

import java.util.Scanner;

public class FindVoNOCoWs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		s=scan.nextLine();
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			System.out.println("Vowels is "+s);
		}
		else if(s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5')
		{
			System.out.println("Numbers is "+s);
		}
		else if(s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9'||s.charAt(i)=='0')
		{
			System.out.println("Numbers is "+s);
		}
		
	}
	}
}
