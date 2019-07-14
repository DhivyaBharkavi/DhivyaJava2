package exercise12july19;
class Bank1
{
	Bank1(int a)
	{
		System.out.println("A");
	}
}
class Paytm extends Bank1
{
	Paytm()
	{
		super(5);
		//Bank1 b = new Bank1();
		System.out.println("B");
		//super(5);
		
	}
}
public class Bank {
public static void main(String [] args){
Paytm p = new Paytm();

}
}
