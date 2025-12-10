package simple.pattern.programs;
import java.util.Scanner;

public class _04_User_Input_Box_Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of rows : ");
		int row = sc.nextInt();
		
		System.out.println("Enter the Number of Columns : ");
		int col=sc.nextInt();
		
		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);
		
		//Box Printing Logic
		for (int i = 1 ; i <= row; i++ )
		{
			for (int j = 1; j <= col; j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		sc.close();
	}
}
