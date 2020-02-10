package FunctionalPrograms;

import java.util.Scanner;

public class Triplets 
{
	public static void main(String[] args) 
	{
		Triplets triplets = new Triplets();
		triplets.FindTriplets();
	}
	private void FindTriplets() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter? ");
		int m = sc.nextInt();
		int arr[] = new int [m];
		int count = 0;
		boolean found = true;
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter element "+(i+1)+":");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length-2; i++) 
		{
			for (int j = i+1; j < arr.length-1; j++) 
			{
				for (int k = j+1; k < arr.length; k++) 
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]+" ");
						System.out.println();
						count++;
						found = true;
					}
				}
			}
		}
		if(!found)
		{
			System.out.println("No triplets found:");
		}
		else
		{
			System.out.println("no of triplets are:"+count);
		}
	}
}
