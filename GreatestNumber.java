package operators;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>b) {
			System.out.println("The greater number is :"+a);
		}
		else if (b>a){
			System.out.println("The greater number is :"+b);
		}
		else {
			System.out.println("The both number are equal.");
		}
	}

}
