package week03;

import java.util.Scanner;

public class decisionStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many software you want to purchase : ");
		int input = sc.nextInt();
		double discount = 0;
		if (input >= 10 && input <= 19) {
			discount = 0.20;

		} else if (input >= 20 && input <= 49) {
			discount = 0.30;

		} else if (input >= 50 && input <= 99) {
			discount = 0.40;
		} else if (input >= 100) {
			discount = 0.50;

		}

		double subTotal = 99 * input;
		double discountedAmount = subTotal * discount;
		double finalAmount = subTotal - discountedAmount;
		System.out.println("SubTotal : $" + subTotal);
		System.out.println("Discount : $" + discountedAmount);
		System.out.println("Final Amount : $" + finalAmount);
		
		//round to two deimal points
		//printf tells the system that you want to format the string
		System.out.printf("Final price: %.2f",finalAmount); // This is called String Formatting 
		// %d is for integer and %f is for float or decimal and for string formatting we use printf

	}

}
