import java.util.Scanner;

public class Driver {
	public static void main (String[] args) {
	int choice = 0, num1 = 0, num2 = 0;
	Scanner input = new Scanner(System.in);
	while (input.hasNextLine()) {
	String s1 = input.nextLine(); 
	choice = Integer.parseInt(s1);
	System.out.println("Enter num1: ");
	s1 = input.nextLine(); 
	num1 = Integer.parseInt(s1);
	System.out.println("Enter num2: ");
	s1 = input.nextLine(); 
	num2 = Integer.parseInt(s1); 
	}
	input.close();
	if ( choice == 1 ) {
		Addition a = new Addition();
		System.out.println("Result: " + a.add(num1,num2));
	}
	else if ( choice == 2 ) {
		Subtraction s = new Subtraction();
		System.out.println("Result: " + s.sub(num1,num2));
	}
	else if ( choice == 3 ) {
		Multiplication m = new Multiplication();
		System.out.println("Result: " + m.mul(num1,num2));
	}
	else if ( choice == 4 ) {
		Division d = new Division();
		System.out.println("Result: " + d.div(num1,num2));
	}
	}
}