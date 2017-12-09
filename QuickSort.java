import java.util.ArrayList;

public class QuickSort 

{
	private ArrayList<keyword> inputArray;
	ArrayList<keyword> result = new ArrayList<keyword>();
	
	int pivotIndex;
	
	public QuickSort()
	{
		inputArray = new ArrayList<keyword>();
	}
	
	public void add(keyword k)
	{
		inputArray.add(k);
		System.out.println("Done!");
	}
	
	public void sort()
	{
		if(inputArray.size()==0)
		{
			System.out.println("invalidOperation");
		}
		else
		{
			result=quickSort(this.inputArray);
			System.out.println("Done!");
		}
	}
	
	public ArrayList<keyword> quickSort(ArrayList<keyword> array)  //回傳array
	{	
		ArrayList<keyword> tmp = new ArrayList<keyword>();
		
		ArrayList<keyword> greaterList = new ArrayList<keyword>();
		ArrayList<keyword> equalList = new ArrayList<keyword>();
		ArrayList<keyword> lessList = new ArrayList<keyword>();
		
		if(array.size()<2)
		{
			return array;
		}
		else
		{
			pivotIndex = (int)array.size()/2;
			int pivot = array.get(pivotIndex).count;
			
			for(int i=0; i<array.size(); i++)
			{
				if(array.get(i).count>pivot)
				{
					greaterList.add(array.get(i));
				}
				else if(array.get(i).count==pivot)
				{
					equalList.add(array.get(i));
				}
				else
				{
					lessList.add(array.get(i));
				}
			}	
		}
		tmp.addAll(quickSort(lessList));
		tmp.addAll(quickSort(equalList));
		tmp.addAll(quickSort(greaterList));

		return tmp;
   	 }	
	
	public void output()
	{
		if(inputArray.size()==0)
		{
			System.out.println("invalidOperation");
		}
		else
		{
			for(int i=0; i<result.size(); i++)
			{
				System.out.print(result.get(i));
			}
		}	
	}
}
