package BasicCorePrograms;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do
		{
			System.out.println("Enter the year:");
			year = sc.nextInt();
		}while(checkDigits(year));
		if(checkForLeapYear(year))
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not a leap year");
		}
	}
	private static boolean checkForLeapYear(int year) 
	{
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private static boolean checkDigits(int year) 
	{
		int r,y = year;
		int count = 0;
		while(y!=0)
		{
			r = y%10;
			y = y/10;
			count++;
		}
		if(count==4)
		{
			return false;
		}
		else
		{
			System.out.println("year should be a four digit number");
			return true;
		}		
	}
}