package week03;

import java.util.Scanner;

public class makingDollars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many days you will work :");
		int days=sc.nextInt(); 
		double amount = 1.0;
		double totalAmount=0.0;
		for(int i=1;i<=days;i++)
		{
			// or we can do
			amount=Math.pow(2,i-1);
			System.out.printf("$$ earnings on day : "+i+" is $ %.0f\n",amount);
			totalAmount+=amount;
		//	amount=amount*2;
			
			
		}
		System.out.println("Total Earnings : $"+totalAmount);
		System.out.printf("Total Earnings : %.0f" ,totalAmount);

	}

}
