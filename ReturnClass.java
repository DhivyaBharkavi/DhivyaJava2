package exercise14july19;
class Book
{
	int price=34;
	String name ="";
}
class Computer
{
	int ram=2;
	int getSpeed()
	{
		int timeclock=2;
		int speed =timeclock * ram;
		return speed;
	}

Book getAction()
{
	Book bo = new Book();
	bo.price=60;
	bo.name="Dhivya";
	return bo;//Many return type is used only or single object name  
}
}
public class ReturnClass {
	public static void main(String []args)
	{
		Computer c = new Computer();
		System.out.println(c.getSpeed());
		int k = c.getSpeed();
		System.out.println(k);
		Book bo=c.getAction();
		System.out.println(bo.price+bo.name);
		System.out.println(c.getAction());
		//System.out.println(bo.price);
		System.out.println(bo.name+bo.price);
		
	}
}
