package week01;
import java.util.Scanner;

public class LandConvertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Enter the value in sqft");
		input = sc.nextInt();
		double x = input / 43560.0;
		System.out.println("Value in acres " + x);
		
		
	}
}
