package exercise12july19;
class A {
int i=10;
}
class B
{
	void display(A a)
	{
		//A a1 = new A();
		System.out.println(a.i);
	}
}
public  class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.display(new A());
	}

}
