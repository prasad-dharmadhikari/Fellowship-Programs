package AlgorithmPrograms;

import java.util.Scanner;

public class GuessNumber 
{

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		find(0,n-1);
	}
	private static void find(int low, int high) 
	{
		Scanner sc = new Scanner(System.in);
		if(low>=high)
		{
			System.out.println("your number is:"+low);
			System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
			return;
		}
		int mid = (low+high)/2;
		int ch = 0;
		System.out.println("press 1 if your number is between "+low+" and "+mid);
		System.out.println("press 2 if your number is between "+(mid+1)+" and "+high);
		ch = sc.nextInt();
		if(ch == 1)
		{
			find(low,mid);
		}
		else
		{
			find(mid+1,high);
		}
	}
}