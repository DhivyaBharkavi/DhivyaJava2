package exercise12july19;
class A3
{
	int x=10;
void print()
{
	int x=5;
	System.out.println(this.x);
	System.out.println(x);
}
int print1()
{
	x++;
	//this.x=x;
	return this.x;
}
}
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a = new A3();
		a.print();
		a.x=20;
		System.out.println(a.print1());
	} 

}
 