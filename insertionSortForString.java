package AlgorithmPrograms;
public class insertionSortForString 
{
	public static void main(String[] args) 
	{
		final String st = "Java Program to Search for a given word in a File";
		String words[] = st.split("\\s+");
		InsertionSort(words);
	}
	private static void InsertionSort(String[] words) 
	{
		int n = words.length;
		for (int i = 1; i < n; i++) 
		{
			String key = words[i];
			int j = i-1;
			while(j >= 0 && words[j].compareToIgnoreCase(key) > 0)
			{
				words[j+1] = words[j];
				j--;
			}
			words[j+1] = key;
		}
		for (int i = 0; i < words.length; i++) 
		{
			System.out.print(words[i]+" ");
		}
	}
}