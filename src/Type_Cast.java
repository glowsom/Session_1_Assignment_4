import java.util.Scanner;

public class Type_Cast {
	public static void main(String[] args) {
		// TODO Compare Logic AND (&&), and Bitwise AND (&) 
		
		// Declaring 6 variable types and initializing only the byte and short.
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		Scanner user_input = new Scanner( System.in );
		
		// Requesting user input to initialize the byte and short variables.
		System.out.print("Type in a number between -128 and 127: ");
		a = user_input.nextByte();
		System.out.print("Type in a number between -32,768 and 32,767: ");
		b = user_input.nextShort();

		// Storing the sum of byte and short variables in the integer variable, then print.
		c = a + b;
		System.out.println("Sum of byte and short is: " + c);
		

		// Storing the sum of short and integer variables in the long variable, then print.
		d = b + c;
		System.out.println("Sum of short and integer is: " + d);

		// Storing the sum of integer and long variables in the float variable, then print.
		e = c + d;
		System.out.println("Sum of integer and long is: " + e);
		

		// Storing the sum of long and float variables in the double variable, then print.
		f = d + e;
		System.out.println("Sum of long and float is: " + f);

	}
}
