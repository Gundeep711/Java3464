package week01;
import java.util.Scanner;

public class ReceipeCalculator {

public static void main(String[] args) {
		
		/*
		 * To make 48 Timbits, you need 1.5 cups of sugar 1 cup of butter 2.75
		 * cups of flour Write a Java program to calculate how much sugar,
		 * butter, and flour you need to create a batch of Timbits. Your program
		 * should: Ask the user to enter how many Timbits she wants to make
		 * Output the amount of sugar, butter, and flour that is needed
		 * 
		 */
		int timbits;
		double sugar=0;
		double butter=0;
		double flour=0;
		double sugarx=1.5/48.0;
		double butterx=1.0/48.0;
		double flourx=2.75/48.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of timbits you want :");
		timbits=sc.nextInt();
		sugar=timbits*sugarx;
		butter=timbits*butterx;
		flour=timbits*flourx;
		
		System.out.println("sugar needed for "+timbits+" is "+sugar );
		System.out.println("butter needed for "+timbits+" is "+butter );
		System.out.println("flour needed for "+timbits+" is "+flour );
		

	}

}
