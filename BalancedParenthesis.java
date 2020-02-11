package DataStructurePrograms;
import java.util.Stack;

public class BalancedParenthesis 
{
	static Stack<Character> stack = new Stack<Character>();
	public static void main(String[] args) 
	{
		String expression = "((5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		char[] exp = expression.toCharArray();
		
		if(isBalanced(exp))
		{
			System.out.println("expression is balanced....");
		}
		else
		{
			System.out.println("expression is not balanced....");
		}
	}

	private static boolean isBalanced(char[] exp) 
	{
		for (int i = 0; i < exp.length; i++) 
		{
			if(exp[i] == '(')
			{
				stack.push(exp[i]);
			}
			if(exp[i] == ')')
			{
				if(stack.empty())
				{
					return false;
				}
				else if(!(isMatching(stack.pop(),exp[i])))
				{
					return false; 
				}
			}
		}
		if(stack.empty())
		{
			return true;
		}
		else
		{
			return false;
		}	
	}

	private static boolean isMatching(Character pop, char c) 
	{
		if(pop == '(' && c == ')' )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}