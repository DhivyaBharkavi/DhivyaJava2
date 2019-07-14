package exercise12july19;
class Bank4
{
	String name="KVB";
}
class UPI extends Bank4
{
	String name="Paytn";
	void print()
	{
		String name="ABC";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UPI p = new UPI();
p.print();
	}

}
