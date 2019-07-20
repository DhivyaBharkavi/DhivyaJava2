package exercise20july19;

public class SingleObjectToOne {
	
	public void display()
	{
		
	//	System.out.println(c[i][j]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SingleObjectToOne s = new SingleObjectToOne();
	s.display();
	int a[] = {1,3,6};
	int b[]={6,5,7};
	int c[][]={a,b};
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println(c[i][j]);
		}
		System.out.println();
	}
	
	}

}
