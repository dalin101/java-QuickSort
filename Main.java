import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	
	{
		QuickSort qs = new QuickSort();
		Scanner in = new Scanner(System.in);

		while(in.hasNextLine())
		{
			String operation = in.next();
			
			switch(operation)
			{
			case "add":
				String name = in.next();
				int count = in.nextInt();
				keyword k = new keyword(name, count);
				qs.add(k);
				break;
			
			case "sort":	
				qs.sort();
				break;
				
			case "output":
				qs.output();
				break;
				
			default:
				System.out.println("invalidInput!");
			}
		}	
	}
}
