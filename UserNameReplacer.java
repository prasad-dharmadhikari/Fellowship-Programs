package BasicCorePrograms;
import java.util.Scanner;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
public class UserNameReplacer 
{
	static final String TEMPLATE = "Hello UserName , How are you?"; 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		String UserName;
		do
		{
			System.out.println("Enter User name:");
			 UserName = sc.next();	
		}while(checkLength(UserName));
		StringReplacer(UserName);
	}
	public static void StringReplacer(String UserName) 
	{
		System.out.println(TEMPLATE.replaceAll("UserName",UserName));
		
	}
	public static boolean checkLength(String UserName)
	{
		if(UserName.length() < 3)
		{
			System.out.println("user name must be of at least 3 characters");
			return true;
		}
		else
		{
			return false;
		}
	}	
}