package week04;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="chups";
		String st="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			st=st+s.charAt(i);
		}
		
		System.out.println(st);
		
		
	}

}
