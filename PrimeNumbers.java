package AlgorithmPrograms;

import java.util.Arrays;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		int number = 2;
		int count = 0;
		int a[] = new int[1000];
		int j = 0;
		while(number<=1000)
		{
			if(isPrime(number))
			{
				a[j] = number;
				count++;
				j++;
			}
			number++;
		}
		System.out.println("Anagram prime numbers are:");
		for (int i = 0; i < count; i++) 
		{
			for (int k = i+1; k < count; k++) 
			{
				if(isAnagram(a[i],a[k]))
				{
					System.out.println(a[i]+ " "+a[k]);
					System.out.println();
				}
			}
		}
		System.out.println("Palindrome prime numbers are: ");
		for (int i = 0; i < count; i++) 
		{
			for (int k = i+1; k < count; k++) 
			{
				if(isPalindrome(a[i],a[k]))
				{
					System.out.println(a[i]+ " "+a[k]);
					System.out.println();
				}
			}
		}
	} 
	private static boolean isPalindrome(int i, int j) 
	{
		int temp = 0;
		int temp2 = i;
		int r = 0;
		
		while(i!=0)
		{
			r = i%10;
			temp = (temp*10) + r;
			i = i/10;
		}
		if(temp == j)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private static boolean isAnagram(int i, int j) 
	{
		String first = Integer.toString(i);
		String second = Integer.toString(j);
		if(first.length() == second.length())
		{
			char a[] = first.toCharArray();
			char b[] = second.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			int v = 0;
			for (int k = 0; k < b.length; k++) 
			{
				if(a[k] == b[k])
				{
					 v = 1;
				}
				else
				{
					v = 0;
					break;
				}
			}
			if(v == 1)
				return true;
			else
				return false;
		}
		else
		{
			return false;
		}
	}
	private static boolean isPrime(int number) 
	{
		for (int i = 2; i <= number/2; i++) 
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
}