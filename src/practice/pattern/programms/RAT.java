package practice.pattern.programms;

public class RAT {

	public static void main(String[] args) {
		
// Logic For Right Aligned reverse triangle.
		
//		for (int i = 1; i <= 5; i++ )		// loop rows 
//		{
//			for (int j = 2; j <= i; j++ ) 	//loop for spaces 
//			{
//				System.out.print("  ");
//			}
//			
//			for (int k = 5; k >= i; k-- ) 	// loop for Stars 
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		

		
//Logic For Left Aligned triangle.
		
//		for (int i = 1; i <= 5; i++ )		// loop rows 
//		{
//			for (int j = 1; j <= i; j++ ) 	//loop for spaces 
//			{
//				System.out.print("* ");
//			}
//			
//			for (int k = 5; k >= i; k-- ) 	// loop for Stars 
//			{
//				System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		
//Logic For Left Aligned reverse triangle.
		
//		for (int i = 1; i <= 5; i++ )		// loop rows 
//		{
//			for (int j = 5; j >= i; j-- ) 	//loop for spaces 
//			{
//				System.out.print("* ");
//			}
//			
////			for (int k = 5; k >= i; k-- ) 	// loop for Stars 
////			{
////				System.out.print("  ");
////			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i <= 5; i++ )		// loop rows 
		{
			for (int j =4; j >= i; j-- ) 	//loop for spaces 
			{
				System.out.print("  ");
			}

			for (int k = 1; k <= i; k++ ) 	// loop for Stars 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
