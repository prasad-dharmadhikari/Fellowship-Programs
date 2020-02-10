package BasicCorePrograms;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		if(n>=0 && n<31)
		{
			for (int i = 0; i <= n; i++) 
			{
				System.out.println((int)Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("limit overflow.....");
		}
	}

}
