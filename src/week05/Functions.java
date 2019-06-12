package week05;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {

		/*
		 * Function is a small program that run inside a bigger program Properties of a
		 * function you can reuse have a return type have a parameters Java,C#,C++,C are
		 * strongly typed languages that means we must declare the type of the variable
		 * before you use it i.e int x=5 you cannot change the variable type i.e int x=5
		 * and x="Hello"
		 * 
		 * Weekly typed language(Js,PHP,Python,TypeKit) means you do not hace to decalre
		 * variable type like in javascript var x=5 in weekly typed var x=5 , x="hello"
		 * is fine it converted the datatype
		 *
		 *
		 * 
		 * Write a function that output total tax you need to pay
		 */

		calcualte(470);
		CalculateDistance(9.8, 10);// on earth
		CalculateDistance(1.62, 10); // on moon

		String finalGrade = getLetterScore();
		System.out.println("Final score : " + finalGrade);
	}

	public static void calcualte(double price) {
		final double TAXRATE = 0.13;
		// double TAXRATE=13.0/100/0; coz of datatype it's double
		// double TAXRATE=13/100; is integer and output will be 0
		double result = price * TAXRATE;
		System.out.println("Tax you need to pay is : " + result);
	}

	public static void CalculateDistance(double g, int t) {
		double d = 0.5 * g * t;
		System.out.println("Distance Travelled : " + d + " meters");
	}

	// Function overloading
	public static void CalculateDistance(String planet, double g, int t) {
		double d = 0.5 * g * t;
		System.out.println("Distance Travelled on   " + planet + ":" + d + " meters");
	}

	public static String getLetterScore() {
		// int total = 0;
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter your Score : " + i + " :");
			score = score + sc.nextInt();
			// total+=score;
		}
		System.out.println("Total score is : " + score);

		double average = score / 5.0;
		System.out.println("Average is : " + average);

		String letterGrade;
		if (average >= 90) {
			letterGrade = "A";
		} else if (average >= 80 && average <= 90) {
			letterGrade = "B";
		} else if (average >= 60 && average <= 69) {
			letterGrade = "D";
		}

		else {
			letterGrade = "F";
		}
		System.out.println("LetterGrade is : " + letterGrade);
		return letterGrade;

	}

}
