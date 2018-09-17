import java.util.*;

public class ManipulatedPQ
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		PriorityQueue PQ = new PriorityQueue (size);
		String [] split = new String [20];
		
		for(int i = 0; i<=size; i++)
		{
			String input = scan.nextLine();
			split = input.split(" ");
			
			if(split[0].equalsIgnoreCase("INSERT"))
			{
				PQ.insert(split[1]);
			}
			else if(input.equalsIgnoreCase("REMOVE"))
			{
				if(!PQ.isEmpty())
				{
					PQ.remove();
				}
			}
		}
		
		System.out.println(PQ.peek());
	}
}
