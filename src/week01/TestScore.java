package week01;
import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		/*
		 * Write a Java program that: 
		 * Asks the user to enter 3 test scores
		 * Calculates the average score
		 *  Output the average to the screen 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("How many scores you want to enter : ");
		int score=sc.nextInt();
		int input;
		int count=0;
		int  sum=0;
		for (int i=1;i<=score;i++)
		{
			System.out.println("Enter score for test "+i+" :");
			input=sc.nextInt();
			sum+=input;
			count++;
		}
		
		double average=sum/count;
		System.out.println(average);
		
		
		
		
		
	}

}
