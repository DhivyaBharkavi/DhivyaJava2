package exercise14july19;

import java.util.Scanner;

public class FindChar {
	private char c,c1;
	int i;
	private  static int id=100;
	public void getInpit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char one");
		c=sc.next().charAt(0);
		/*System.out.println("Enter char one");
		c1=sc.next().charAt(0);
	*/}
	public void cal()
	{
		/*int value='e';
		System.out.println(value);*/
		
		for(c='e';c<'j';c++)
		{
	
			System.out.println(c);
		}
	}
	public void cal1()
	{
		while(c<7)
		{
			c++;
			System.out.println(c);
			//c++;
		}
	}
	static void main()
	{
	System.out.println(id);	
	}
	void main1()  
	{
	System.out.println(id);	
	}
	void display()
	{
		System.out.println(id);
	}
	public static void main(String args[] )
	{
		FindChar fc = new FindChar();
	
		//fc.getInpit();
		fc.cal();
		fc.cal1();
		fc.id=200;
		new FindChar().main();
		fc.main();
		
	//	System.out.println(args[0]//+args[1]);

}
}
