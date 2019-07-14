package exercise14july19;

public class Program {
	int x=4;
	//static int x=5;
	Program getValue(Program p)
	{
		int y=20;
		p.x=30;
		return p;
	}
	public static void main(String args[])
	{
		//Program p = new Program();
		Program p1 = new Program();
		//Program p2 = new Program();
		// Program p2 = p1.getValue(new Program());
		Program p2 = p1.getValue(p1);
		System.out.println(p2.x);
		System.out.println(p1.x);
	}
}
