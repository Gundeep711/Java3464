package week04;

import java.util.Scanner;

public class StringAddNumbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the numbers separated by comma :");
				String st=sc.next();
			
				int beginIndex=0;
				char[] ch=new char[st.length()];
				int sum=0;
				int num;
				for(int i=0;i<st.length();i++)
				{
					if(st.charAt(i)!=',')
					{
					
						ch[i]=st.charAt(i);
						num=Integer.parseInt(String.valueOf(ch[i]));
						sum+=num;
					}
				}
				System.out.println(sum);
				
	}

}
