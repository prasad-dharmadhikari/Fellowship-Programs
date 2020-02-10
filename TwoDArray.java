package FunctionalPrograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray 
{
	int mArray[][];
	int m,n;
	PrintWriter p;
	public TwoDArray(int m, int n) 
	{
		mArray = new int [m][n];
		this.m = m;
		this.n = n;
		p = new PrintWriter(System.out,true);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
	    int m = sc.nextInt();
	    System.out.println("Enter no of columns:");
	    int n = sc.nextInt();
	    TwoDArray array = new TwoDArray(m, n);
	    array.takeInput();
	    array.print();

	}
	private void print() 
	{
		for (int row = 0; row < m; row++) 
		{
			for (int col = 0; col < n; col++) 
			{
				p.print(" "+mArray[row][col]);
			}
			p.println();
		}
	}
	private void takeInput() 
	{
		Scanner sc = new Scanner(System.in);
		for (int row = 0; row < m; row++) 
		{
			for (int col = 0; col < n; col++) 
			{
				System.out.print("Array ["+(row+1)+"]["+(col+1)+"] :");
				mArray[row][col] = sc.nextInt();
			}
		}
	}
}
