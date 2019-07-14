package exercise14july19;
class Computer1
{
	static Printer out = new Printer();
	static int ram=4;
	final int re=45;
	/*final void process()
	{
		System.out.println("Hello");
	}*/
	void process()
	{
		System.out.println("Hello");
	}
	void doWork()
	{
		
	}
}	
class Machine extends Computer1
{
	void doWork()
	{
		
	}
	/*void process()
	{
		System.out.println("Old process");
	}*/
	final void process()
	{
		System.out.println("Old process");
	}

}
class Printer
{
	void print(int a)
	{
		//re=56;
		System.out.println(a);
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Computer1.ram);
		//System.out.println(Printer.re);
		Computer1.out.print(50);
	}

}
