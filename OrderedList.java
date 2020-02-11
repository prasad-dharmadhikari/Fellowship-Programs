package DataStructurePrograms;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		List<Integer> orderedList = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		String pathname = "C:\\Users\\Prasad Dharmadhikari\\Desktop\\numbers.txt";
		File file = new File(pathname);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		String words[] = line.split(",");
		int numbers[] = new int[words.length];
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = Integer.parseInt(words[i]);
		}
		for (Integer integer : numbers) 
		{
			orderedList.add(integer);
		}
		Collections.sort(orderedList);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		if(orderedList.contains(n))
		{
			orderedList.remove(n);
		}
		else
		{
			orderedList.add(n);
		}
		Collections.sort(orderedList);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < orderedList.size(); i++) 
		{
			sb.append(orderedList.get(i)+",");
		}
		String str = sb.toString();
		FileOutputStream outputStream = new FileOutputStream("c:/Users/Prasad Dharmadhikari/Desktop/numbersupdated.txt");
	    DataOutputStream dataOutStream = new DataOutputStream(new BufferedOutputStream(outputStream));
	    dataOutStream.writeUTF(str);
	    dataOutStream.close();
	    sc.close();
	    br.close();
	}
}
