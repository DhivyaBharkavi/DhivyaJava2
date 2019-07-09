package exercise9july19;

import java.util.Scanner;

public class EBill {
int unit,unit1,unit2,unit3;
Scanner scan = new Scanner(System.in);
void getInput()
{
	System.out.println("Enter unit");
	unit=scan.nextInt();
}
void ebbill()
{
	if(unit>1 && unit<100)
	{
		unit=unit * 5;
		System.out.println("EB Unit is "+unit);
	}
	else if(unit>101 && unit<200)
	{
		unit1=(unit-100) * 7+(100*5);
		System.out.println("EB Unit is "+unit);
	}
	else if(unit>201 && unit < 300)
	{
		unit2=(unit-100) * 12+(100*5)+(100*7);
		System.out.println("EB Unit is "+unit);
	}
	else if(unit > 300)
	{	
		unit3 = unit * 15;
		System.out.println("EB Unit is "+unit);
	}
}
}
