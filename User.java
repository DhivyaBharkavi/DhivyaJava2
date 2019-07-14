package exercise14july19;
class UserName
{
	int id=12;
	public int b=454;
	protected int c=45;
	protected String name="gg";
	private int d=35;
}
public class User {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserName u = new UserName();
		System.out.println(u.id);//default access modifier 
		System.out.println(u.b);//public access modifier
		System.out.println(u.c);//protected access modifier only used child class derived from parent class 
		System.out.println(u.name);
		//System.out.println(u.d);//private access modifier it is no access in any class 
	}

}
