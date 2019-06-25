package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProblemSet {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		
		String input=sc.next();
		String reverse;
		char ch[]=input.toCharArray();
		for (int i=0;i<input.length();i++)
		{
			System.out.println(ch[i]);
			
		}
		for(int j=input.length()-1;j>=0;j--)
		{
			System.out.println(ch[j]);
		}*/
		
		
		
		
		
		int arr[]=new int[10];
		for(int k=0;k<arr.length;k++)
		{
			arr[k]=k;
			System.out.println("Square root of "+k+" is "+Math.pow(arr[k], 2));
		}
	}

}
