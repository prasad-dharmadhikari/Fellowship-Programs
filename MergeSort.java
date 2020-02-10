package AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort 
{
//	int n;
//	int b[] = new int [n+1];
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("how many elements do you want to enter?");
		int n = sc.nextInt();
		int array [] = new int[n];
		System.out.println("enter the elements:");
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = sc.nextInt();
		}
		int lb = 0;
		int ub = n-1;
		int b[] = mergesort(array,lb,ub);
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
		
		//printArray(array , n);
		System.out.println("array after sorting using mergesort algorithm");
	    System.out.println(Arrays.toString(array));
	}
	public static int[] mergesort(int[] array, int lb, int ub) 
	{
		if(lb<ub)
		{
			int mid = (lb+ub)/2;
			mergesort(array, lb, mid);
			mergesort(array, mid+1, ub);
		}
		int start = lb;
		int mid = (lb+ub)/2;
		int k = mid + 1;
		int l = lb;
		int b[] = new int[ub];
		while(lb<=mid && k<=ub)
		{
			if(array[lb] >= array[k])
			{
				b[l] = array[k];
				k++;
			}
			else
			{
				b[l] = array[lb];
				lb++;
			}
			l++;
		}
		if(lb>mid)
		{
			while(k <= ub)
			{
				b[l] = array[k];
				l++;
				k++;
			}
		}
		else
		{
			while(lb <= mid)
			{
				b[l] = array[lb];
				l++;
				lb++;
			}
		}
		return b;	
	}
}
