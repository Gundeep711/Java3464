package week03;

import java.util.Scanner;

public class CountTheletters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string :");
		String st=sc.next();
		System.out.println("Enter the character you want to check :");
		String ch=sc.next();
		char c= ch.charAt(0);
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
