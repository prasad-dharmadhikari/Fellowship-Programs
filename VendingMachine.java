package JUnitTesting;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int mNote = 0;
		System.out.println("Enter the change:");
		int n = sc.nextInt();
		CalculateMinimum(n);
	}
	private static void CalculateMinimum(int n) 
	{
		int mNote = 0;
		if(n == 0)
		{
			return;
		}
		if(n>=1000)
		{
			mNote = mNote + (int)n/1000;
			System.out.println("1000 rs notes are :"+((int)n/1000));
			if(n/1000 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%1000);	
			}
		}
		else if(n>=500)
		{
			mNote = mNote + (int)n/500;
			System.out.println("500 rs notes are :"+((int)n/500));
			if(n/500 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%500);	
			}
		}
		else if(n>=100)
		{
			mNote = mNote + (int)n/100;
			System.out.println("100 rs notes are :"+((int)n/100));
			if(n/100 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%100);	
			}
		}
		else if(n>=50)
		{
			mNote = mNote + (int)n/50;
			System.out.println("50 rs notes are :"+((int)n/50));
			if(n/50 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%50);	
			}
		}
		else if(n>=10)
		{
			mNote = mNote + (int)n/10;
			System.out.println("10 rs notes are :"+((int)n/10));
			if(n/10 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%10);	
			}
		}
		else if(n>=5)
		{
			mNote = mNote + (int)n/5;
			System.out.println("5 rs coins are :"+((int)n/5));
			if(n/5 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%5);	
			}
		}
		else if(n>=2)
		{
			mNote = mNote + (int)n/2;
			System.out.println("2 rs coins are :"+((int)n/2));
			if(n/2 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%2);	
			}
		}
		else if(n>=1)
		{
			mNote = mNote + (int)n/1;
			System.out.println("1 rs coins are :"+((int)n/1));
			if(n/1 == 0)
			{
				return;
			}
			else
			{
				CalculateMinimum(n%1);	
			}
		}
	}
}