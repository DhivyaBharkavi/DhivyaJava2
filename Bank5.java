package exercise12july19;
class Ba
{
	Ba()
	{
		this(5);
	}
	void rate()
	{
		System.out.println(10);
	}
Ba(int a)
{
	System.out.println(a);
}
}
class KVB extends Ba
{
	void rate()
	{
		System.out.println(5);
	}
	void message()
	{
		rate();
		super.rate();
	}
}
public class Bank5 {
public static void main(String [] args)
{
	KVB k =new KVB();
	k.message();
	k.rate();
	Ba b = new Ba();
}
}
