package week04;

public class StringExamples {
	
	public static void main(String[] args)
	{
		String name="peter sigurdson";
		System.out.println(name);
		
		int numChars=name.length();
		System.out.println("Number of characters "+numChars);
		
		char charAtPosition=name.charAt(4);
		System.out.println("Character at position 4 "+charAtPosition);
		
		String sub=name.substring(0,5);
		System.out.println("Get Subsctring 1 :"+sub);
		
		String sub2=name.substring(7);
		System.out.println("Get substring 2 :"+sub2);
		
		String a="emad";
		String b="mohammad";
		String c="emad";
		
		if(a.contentEquals(b))
		{
			System.out.println("a & b are same!");
		}
		else
		{
			System.out.println("a & b are not same");
		}
		
		// object comparision btwn a and c
		if(a==c)
		{
			System.out.println("a & c are same !!");
		}
		else
		{
			System.out.println("a and c are not same");
		}
		
		// uppercase
		String m="yelling";
		System.out.println(m.toUpperCase());
		
		String m1="GunDeeP";
		System.out.println(m1.toUpperCase());
		//Lowercase
		String s1="singh";
		System.out.println(s1.toLowerCase());
	}

}
