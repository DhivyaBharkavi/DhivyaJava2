package exercise14july19;
class Internet
{
	void getConnection()
	{
		System.out.println("Airtel");
	}
}
class Bank
{
	int code=5;
	Internet in = new Internet();
void display()
{
	in.getConnection();
}
void message()
{
	in.getConnection();
}
}
public class Staff {
public static void main(String args[])
{
	Bank b = new Bank();
	System.out.println(b.code);
	//int c=b.in.getConnection();
	//System.out.println(b.in.getConnection());
	//System.out.println(b.display());
	//System.out.println(b.message());
}
}
