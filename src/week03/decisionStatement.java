package week03;

import java.io.PrintStream;

public class decisionStatement {
  public decisionStatement() {}
  
  public static void main(String[] args) { java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("How many software you want to purchase : ");
    int input = sc.nextInt();
    double discount = 0.0D;
    if ((input >= 10) && (input <= 19)) {
      discount = 0.2D;
    }
    else if ((input >= 20) && (input <= 49)) {
      discount = 0.3D;
    }
    else if ((input >= 50) && (input <= 99)) {
      discount = 0.4D;
    } else if (input >= 100) {
      discount = 0.5D;
    }
    

    double subTotal = 99 * input;
    double discountedAmount = subTotal * discount;
    double finalAmount = subTotal - discountedAmount;
    System.out.println("SubTotal : $" + subTotal);
    System.out.println("Discount : %" + discountedAmount);
    System.out.println("Final Amount : $" + finalAmount);
    


    System.out.printf("Final price: %.2f", new Object[] { Double.valueOf(finalAmount) });
  }
}