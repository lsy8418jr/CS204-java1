package Homework;

import java.util.Scanner;

/*Create a while loop that asks the user to enter an number and ends when a 0 is entered, 
 * find the product of the numbers entered.

 */
public class WhileLoop {
	public static void main(String[] args) {

		int multiNum = 1;
		
		// use Scanner statement to enter number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer number : ");
		int enteredNum = input.nextInt();
		
		//determine entered number if the number is positive
		if (enteredNum > 0) {
			while (enteredNum != 0) {
				multiNum *= enteredNum;
				enteredNum--;
			}

		}
		//determine entered number if the number is negative
		else if (enteredNum < 0) {
			while (enteredNum != 0) {
				multiNum *= enteredNum;
				enteredNum++;
			}
		}
		//determine entered number if the number is 0
		else {
			multiNum = 0;
		}

		System.out.println("the product of the numbers entered :" + multiNum);
	}
}
