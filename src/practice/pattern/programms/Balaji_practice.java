package practice.pattern.programms;

public class Balaji_practice {
	public static void main(String[] args) {
		
		
		// box of space and star
//		for ( int i=1 ;i<=5  ; i++) 
//		{
//			for (int j=1  ;j<=5 ; j++)
//			{
//				System.out.print("_ ");
//			}
//			for (int j=1  ;j<=5 ; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		// Right Aligned - right angle triangle
//		for ( int i=1 ;i<=5  ; i++) 
//		{
//			for (int j=5  ;j>=i ; j--)
//			{
//				System.out.print("  ");
//			}
//			for (int j=1  ;j<=i ; j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		
		// right aligned reverse right angle triangle
//		for ( int i=1 ;i<=5  ; i++) 
//		{
//			for (int j=1  ;j<=i ; j++)
//			{
//				System.out.print("  ");
//			}
//			for (int j=5  ;j>=i ; j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		// hallow Box Pattern
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if (i==1 || i==5 || j==1 || j==5 ) 
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
	}
}
