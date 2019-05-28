package week03;

import java.util.Scanner;

public class sumNumbers {
  public sumNumbers() {}
  
  public static void main(String[] args) { Scanner input = new Scanner(System.in);
    

    int sum = 0;
    System.out.println("Enter the number :");
    int number = input.nextInt();
    for (int i = 1; i <= number; i++)
    {
      sum += i;
    }
    

    System.out.println("Sum of numbers is : " + sum);
  }
}