package exercise19july19;

import java.util.Scanner;

public class FindWordTest {
	
	
public static void main(String []args){
	FindWord fw = new FindWord();
	/*String s = new String();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a sentences");
	s=scan.nextLine();
	boolean s1=s.contains("green");
	System.out.println(s1);
	*/
	fw.getInput();
	fw.find();
}
}
