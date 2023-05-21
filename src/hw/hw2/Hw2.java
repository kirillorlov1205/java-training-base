package hw.hw2;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {

		//Task 1 string--------------------------------------------
//		System.out.println("Hi man!\nWhat we will do now?\n\"I work\"\n-\"No, please\"");

		//Task 2 mathematics--------------------------------------------
/*			2+4 = 6
			3++ + 24 - --4 = 24
			4.0 + 2.4 + --2 = 7.4
			2+2*2 = 6
			(2+2)*2 = 8
			(4>5)||(3>2) = true
			(21>5)||(4<3) = true
			(2>0)&&(5>4) = true
			(3<5)&&(6>4) = true
			!(5>=5) = false
			3-- -3 + ++4 + 4/2++ * 5%3 - (17%4) = 8*/

		//Task 3 bytes --------------------------------------------
	/*  int[] array = new int[47]; = 188
   		double array[] = {3, 5, 4, 6, 88}; = 40
   		char array[] = new char[33]; = 66 */

		//Task 4 FormatStr--------------------------------------------
		System.out.println(strFormat("testing"));

		//Task 6 Recursion--------------------------------------------
		System.out.println(getDoubledInt(3));

		//Task 5 Sum of array-----------------------------------------
		int[][] arr = {{1, 2, 5, 32}, {123, 23, 1}};
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);

		//Task 5 Sum of array-----------------------------------------
		System.out.println(addition());
	}

	public static double addition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide number one");
		double num1 = scan.nextDouble();
		System.out.println("Provide number two");
		double num2 = scan.nextDouble();
		return num1 + num2;
	}

	public static String strFormat(String str) {
		return "[" + str + "]";
	}

	public static int getDoubledInt(int number) {
		if (number > 30) {
			return number;
		} else {
			return getDoubledInt(number * 2);
		}
	}
}