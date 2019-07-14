package exercise14july19;
class App1
{
	private int code=4;
	final int model=2017;
	//static final int model1=2017;
	void print()
	{
		code=5;//private can be change in this method and changed and assigned
		System.out.println(code);
		System.out.println(model);
		//code=5;
		//model=2019;
	}
}
final class App2 extends App1
{
	
}
final public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App1 a = new App1();
		a.print();
		System.out.println(a.model);//only print and call
		//System.out.println(a.code);//not call and also not change
		//a.model=345;
		//a.model1=345;
	}

}
