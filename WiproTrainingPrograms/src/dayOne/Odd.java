package dayOne;

import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	if (num % 2 != 0) {
		System.out.println("Number is Odd");
	} else
		System.out.println("Number is Even");
	}
}
