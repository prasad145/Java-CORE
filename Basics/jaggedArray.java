import java.util.Scanner;

public class jaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][];
		a[0] = new int[4];
		a[1] = new int[2];
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				int e = sc.nextInt();
				a[i][j] = e;
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
