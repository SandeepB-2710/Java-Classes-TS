package simple.pattern.programs;

public class _08_Space_and_Box {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++ ) 		// loop for rows 
		{
			
			for (int j = 2; j <= i; j++)		// Loop for Spaces
			{
				System.out.print("  ");
			}
			
			for (int j = 5; j >= i; j--) 	// loop for Stars
			{
				System.out.print("* ");		
			}
			
			System.out.println();			//move to next line 
		}
	}
}
