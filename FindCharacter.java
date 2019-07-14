package exercise14july19;

import java.util.Scanner;

public class FindCharacter {
	char c;
	void getInput()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a character");
	c=scan.next().charAt(0);
	}
	void findcharacter()
	{
		//char value='+';
		/*for(c='a';c<='z';c++)
		{*/
		if(c>='a' && c<='z')
		{
		System.out.println("Lower case character is "+c);
		}
		
		else if(c>='A' && c<='Z')
		{
			System.out.println("Upper case character is "+c);
		}
		else if(c>='0'&& c<='9')
		{
			System.out.println("Number is "+c);
		}
		else
		{
			System.out.println("Special character is "+c);
		}
		}
	
}
