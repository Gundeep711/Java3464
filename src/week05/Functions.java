package week05;

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

	}

	public static void calcualte(double price) {
		double TAXRATE = 0.13;
		//double TAXRATE=13.0/100/0; coz of datatype it's double
		//double TAXRATE=13/100; is integer and output will be 0
		double result = price * TAXRATE;
		System.out.println("Tax you need to pay is : " + result);
	}

}
