package operators;

import java.util.*;

public class ArthematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int s = a + b;
		int m = a * b;
		int d = a / b;
		int sb=a-b;
		
		System.out.println("Sum of a and b :" +s);
		System.out.println("multiplication of a and b :"+m);
		System.out.println("division of a and b :"+d);
		System.out.println("Subtraction of a and b :"+sb);
	}
}
