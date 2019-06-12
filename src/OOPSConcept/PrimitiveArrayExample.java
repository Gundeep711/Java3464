package OOPSConcept;

public class PrimitiveArrayExample {

	public static void main(String[] args) {
		// 1. Create an empty array of String
		// By default, array stores 5 names
		String[] names = new String[5];
		
		// 2. Show the total number of items in array
		System.out.println("Total number of items in array: ");
		// @TODO: Write code to output total num items to array
		//System.out.println("----------");
		System.out.println(names.length);
		
		// 3. Add something to array
	 	names[0] = "Jenelle"; 
		// @TODO: Write code to add someone to index 3
		names[3] = "Gundeep";
		
		// 4. Output the item in position 0
		System.out.println("Name in pos 0:");
				// @TODO: Write the code to output the the name in pos 0
		System.out.println(names[0]);
		System.out.println("Name in pos 3:"+names[3]);
		
		// 5. Output everything in array
		System.out.println("Everything in array: ");
		// @TODO: Write code to output everything
		//System.out.println(names.ToString()); will output some hexadecimal code
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
				
		// 6. Add something to the end of the array
		try{
		names[7] = "Emad";
		// @TODO:  Write code to output names[7] to screen
		System.out.println("pos 7 :"+names[7]); // index out of bound exception
		}
		catch (Exception e) {
			System.out.println("error occurs when adding element "+e.toString());
			// TODO: handle exception
		}
		// 7. Remove someone from the array
		// @TODO: Fill in code here
		names[3]=null;
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		
		// 8. Loop through every item in the array and output:
		// HELLO _______ (where ___ is the name)
		names[1]="Joban";
		names[2]="Gundeep";
		names[3]="Raman";
		names[4]="Peter";
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Hello "+names[i]);
		}
		
		// 9. Shift everyone by 1 position
		// @TODO: Fill in code here
	/*	String temp;
		for(int i=names.length-2;i>=0;i--)
		{
			names[i+1]=names[i];
			temp=names[i];
			names[i]=null;
			
		}
		*/
		String lastElement = names[0];
		String currentElement;
		for(int j=1;j<names.length;j++)
		{ 
			
			currentElement = names[j];
			names[j] = lastElement;
			//Swap Done
			
			lastElement = currentElement;
			
			
		}
		
		names[0] = null;
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Hello next "+names[i]);
			
		}
		
	}

}
