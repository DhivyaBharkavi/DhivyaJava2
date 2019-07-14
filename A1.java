package exercise12july19;

public class A1 {
int i=10;
}
class B1
{
	void display(A1 a)
	{
		//A a1 = new A();
		System.out.println(a.i);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		B1 b = new B1();
		b.display(new A1());
		//B b = new B();
		//b.display();
		
	}
}
