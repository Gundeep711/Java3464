package week03;

import java.io.PrintStream;

public class makingDollars {
  public makingDollars() {}
  
  public static void main(String[] args) { java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("How many days you will work :");
    int days = sc.nextInt();
    double amount = 1.0D;
    double totalAmount = 0.0D;
    for (int i = 1; i <= days; i++)
    {

      amount = Math.pow(2.0D, i - 1);
      System.out.printf("$$ earnings on day : " + i + " is $ %.0f\n", new Object[] { Double.valueOf(amount) });
      totalAmount += amount;
    }
    


    System.out.println("Total Earnings : $" + totalAmount);
    System.out.printf("Total Earnings : %.0f", new Object[] { Double.valueOf(totalAmount) });
  }
}