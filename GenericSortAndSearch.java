package AlgorithmPrograms;
class Container<T extends Comparable<T>>
{
	 T a[];
	public Container(T[] numbers) 
	{
		a = numbers;
	}
	public int search(Comparable<T> v) 
	{
		//int p = 0;
		int low = 0;
		int high = a.length - 1;
		while(low < high)
		{
			int mid = (low + high)/2;
			T midVal = a[mid];
			int result = v.compareTo(midVal);
			if(result < 0)
			{
				low = mid - 1;
			}
			else if(result > 0)
			{
				high = mid + 1;
			}
			else
			{
				return mid;
			}
		}	
		return -1;
	}
}
public class GenericSortAndSearch 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {15,22,36,69,78,89,90,96,99,102,106,109};
		Container<Integer> obj = new Container<Integer>(numbers);
		System.out.println("hello");
		int flag = obj.search(90);
		System.out.println(flag);
//		if(flag)
//		{
//			System.out.println("found");
//		}
//		else
//		{
//			System.out.println("not found");
//		}
	}
}