package DataStructurePrograms;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UnorderedList 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		String pathname = "C:\\Users\\Prasad Dharmadhikari\\Desktop\\abc.txt";
		File file = new File(pathname);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		String words[] = line.split("\\s+");
		List<String> list = new LinkedList<String>();
		for (String string : words) 
		{
			list.add(string);
		}
		System.out.println("enter a word:");
		String word = sc.next();
		if(list.contains(word))
		{
			list.remove(word);
		}
		else
		{
			list.add(word);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.size(); i++) 
		{
			sb.append(list.get(i)+" ");
		}
		String str = sb.toString();
		FileOutputStream outputStream = new FileOutputStream("c:/Users/Prasad Dharmadhikari/Desktop/pqr.txt");
	    DataOutputStream dataOutStream = new DataOutputStream(new BufferedOutputStream(outputStream));
	    dataOutStream.writeUTF(str);
	    dataOutStream.close();
	    sc.close();
	    br.close();
	}
}