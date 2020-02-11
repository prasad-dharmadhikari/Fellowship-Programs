package DataStructurePrograms;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerUsingDequeue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		String word = sc.next();
		char letters[] = word.toCharArray();
		Deque<Character> deque = new LinkedList<Character>();
		for (Character character : letters) 
		{
			deque.addLast(character);
		}
		boolean flag = true;
		while(deque.size()>1 && flag)
		{
			char first = deque.removeFirst();
			char last = deque.removeLast();
			if(first!=last)
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("palindrome string.........");
		}
		else
		{
			System.out.println("not palindrome string.........");
		}
		
	}
//		
//		char letter[] = new char[letters.length];
//		for (int i = 0; i < letter.length; i++) 
//		{
//			letter[i] = deque.getFirst();
//		}
//		String word2 = letter.toString();
//		if(word2.equals(word))
//		{
//			System.out.println("given string is palindrome.......");
//		}
//		else
//		{
//			System.out.println("given string is not palindrome.......");
//		}
//		

	
}

