import java.util.Scanner;

public class arrayInitialization {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2]; // allocated memory space to array a, where by default two zeroes stored
		for(int i = 1; i <= 2; i++)
		{
			int e = sc.nextInt();
			a[i - 1] = e;
		}
		for(int x: a)
		{
			System.out.print(x + " ");
		}
		sc.close();
	}
	
}
