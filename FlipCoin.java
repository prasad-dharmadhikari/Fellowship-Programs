package BasicCorePrograms;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		int number = 0;
		int heads = 0,tails = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("How many times you want to flip a coin?");
			number = sc.nextInt();
		}while(validateNumber(number));
		int count = 1;
		while(count<=number)
		{
			double random = getRandomValue();
			//System.out.println(random);
			if(random < 0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
			count++;
		}
		double percentage = percentageHeadsvsTails(heads,tails,number);
		System.out.println("percentage of heads is:"+percentage);
		System.out.println("percentage of tails is:"+(100-percentage));
	}
	private static double percentageHeadsvsTails(int heads, int tails, int number) 
	{
		double p = (double)((100.0*heads)/number);
		return p;
	}
	private static double getRandomValue() 
	{
		double r = ThreadLocalRandom.current().nextFloat();
		return r;
	}
	private static boolean validateNumber(int number) 
	{
		if(number > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
