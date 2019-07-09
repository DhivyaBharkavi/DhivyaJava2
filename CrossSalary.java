package exercise9july19;

import java.util.Scanner;

public class CrossSalary {
	int salary;
	double hra,da,crossSalary;
	Scanner scan = new Scanner(System.in);
	void getInput()
	{
		System.out.println("Enter salary");
		salary=scan.nextInt();
	}
	void calculate()
	{
		if(salary <= 10000)
		{
			hra = salary * 0.2;
			da = salary * 0.8;
			crossSalary=salary+hra+da;
			System.out.println("HRA "+hra);
			System.out.println("Da " +da);
			System.out.println("Cross Salary "+crossSalary);
		}
		else if(salary <= 20000)
		{
			hra = salary * 0.25;
			da = salary * 0.9;
			crossSalary=salary+hra+da;
			System.out.println("HRA "+hra);
			System.out.println("Da " +da);
			System.out.println("Cross Salary "+crossSalary);
		}
		else if(salary > 20000)
		{
			hra = salary * 0.3;
			da = salary * 0.95;
			crossSalary=salary+hra+da;
			System.out.println("HRA "+hra);
			System.out.println("Da " +da);
			System.out.println("Cross Salary "+crossSalary);
		}
	}
}
