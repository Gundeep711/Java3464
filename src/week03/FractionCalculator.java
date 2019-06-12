package week03;

public class FractionCalculator {

	public static void main(String[] args) {
		
		double sum = 0;
		for (int i = 1,j=30; i <= 30 && j>=1; i++,j--) 
		{
			System.out.println(j);
			sum += ((double)i / j);
			System.out.println(sum);
			
		}

		System.out.println(sum);
	}

}
