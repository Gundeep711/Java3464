package week03;

import java.util.Scanner;

public class SalesChart {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter sales number for store : "+i);
			int sales=sc.nextInt();
			int j=sales/100;
			arr[i-1]=j;
			for(int k=0;k<arr[i-1];k++)
			{
				
				System.out.print("*");
				
			}
		}
		
		
		
		
	}
	
}
