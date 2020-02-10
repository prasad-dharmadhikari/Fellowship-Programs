package AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		String pathname = "C:\\Users\\Admin\\Desktop\\abc.txt";
		File f = new File(pathname);
		BufferedReader bf = new BufferedReader(new FileReader(f));
		String st = bf.readLine();
		//System.out.println(st);
		String word[] = st.split("\\s+");
		Arrays.sort(word);
		System.out.println("enter word to search:");
		String key = sc.next();
//		int i = Arrays.binarySearch(word, key);
//		if(i<0)
//		{
//			System.out.println("not found");
//		}
//		else
//		{
//			System.out.println("found at index "+i);
//		}
		int low = 0;
		int high = word.length-1;
		int found = 0;
		while(low < high)
		{
			int mid = (low + high)/2;
			
			if(key.compareTo(word[mid]) == -1)
			{
				high = mid -1;
			}
			else if(key.compareTo(word[mid]) == 1)
			{
				low = mid +1;
			}
			else // (key.equals(word[mid]))
			{
				System.out.println("found");
				found = 1;
				break;
			}
		}
		if(found!=1)
		{
			System.out.println("not found");
		}
	}
}