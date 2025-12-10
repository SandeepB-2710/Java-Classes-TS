package simple.pattern.programs;
import java.util.Scanner;

public class _06_Inverted_Right_Angle_Triangle_With_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ )
		{
			for (int j = n; j >= i; j-- )
			{
				if (i <= 9) 
				{
					System.out.print("0"+ j + " ");
				}
				else 
				{
					System.out.print(j + " ");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
