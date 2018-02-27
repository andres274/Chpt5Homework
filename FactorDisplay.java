/* 5.16 (Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors in increasing order. For example if the integer is 120, the output should be as follows: 2,2,2,3,5.
 */

import java.util.Scanner;

public class FactorDisplay {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer");
		int integer = keyboard.nextInt();
		keyboard.close();
		for (int i=2; i<=integer;) {
			if (integer % i == 0) {
				System.out.print(i + ", ");
				integer /= i;
			}
			else {
				i++;
			}
		}
	}
}
