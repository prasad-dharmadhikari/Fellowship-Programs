package DataStructurePrograms;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class customer
{
	String name;
	int money;
	public customer(String name, int money) 
	{
		super();
		this.name = name;
		this.money = money;
	}
	public String toString() 
	{
		return "customer [name=" + name + ", money=" + money + "]";
	}	
}

public class BankingCashCounter 
{
	static int balance = 0;
	public static void main(String[] args) 
	{
		Queue<customer> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of people:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			System.out.println("enter customer name:");
			String name = sc.next();
			System.out.println("enter amount:");
			int amt = sc.nextInt();
			customer customer = new customer(name, amt);
			System.out.println("press D to deposit amount or W to withdraw amount:");
			char input = sc.next().charAt(0);
			if(input == 'D')
			{
				queue.add(customer);
				balance = balance + amt;
				System.out.println("amount deposited successfully.....");
				System.out.println("current balance is:"+balance);
			}
			else if(input == 'W')
			{
				queue.add(customer);
				if(balance<amt)
				{
					System.out.println("cannot withdraw.....");
				}
				else
				{
					balance = balance - amt;
					System.out.println("amount deposited successfully.....");
					System.out.println("current balance is:"+balance);
				}
			}
		}
		System.out.println("customers in queue are:");
		for (customer customer : queue) 
		{
			System.out.println(customer);
			System.out.println();
			//queue.remove(customer);
		}
		
	}
}
