package week03;

import java.util.Scanner;

public class fatCalc {
  public fatCalc() {}
  
  public static void main(String[] args) {
    Scanner calories = new Scanner(System.in);
    System.out.println("Enter the total amount of Calories :");
    int cal = calories.nextInt();
    Scanner fat = new Scanner(System.in);
    System.out.println("Enter the number of grams of fat :");
    int grms = fat.nextInt();
    if (grms * 9 < cal * 0.3D)
    {
      System.out.println("Food is Healthy");

    }
    else
    {
      System.out.println("Food is Unhealthy");
    }
  }
}