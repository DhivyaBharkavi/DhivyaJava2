package exercise19july19;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		//s=scan.next();
		s=scan.nextLine();
		int s1=s.length();
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.charAt(0));
		System.out.println(s.replace("java","python"));
		System.out.println("The sentences with space length "+s1);
		int s2=s.length();
		int count=0;
		if(s2 !=' ')
		{
			count++;
			System.out.println("The sentences without space length "+s2+"\n No  of times "+count);
		}
		System.out.println(s.contains("green"));//It search a word in that sentences. Then it find a word is true otherwise false so it return boolen expression.
	}

}
