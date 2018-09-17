public class PriorityQueue 
{
	String [] array;
	int size;
	
	public PriorityQueue(int qSize)
	{
		array = new String [qSize];
		size = 0;
	}
	
	public void insert(String word)
	{
		if(size==0)
		{
			array[0] = word;
			size++;
		}
		else
		{
			
			for(int i = size-1; i>=0; i--)
			{
				if((word.length() < array[i].length()) || (word.compareTo(array[i])<0))
				{
					String temp = array[i];
					array[i] = word;
					array[i+1] = temp;
				}
				else if(word.length() > array[i].length() || (word.compareTo(array[i])>0))
				{
					array[i+1] = word;
				}
			}
			size++;
		}
	}
	
	public String remove()
	{
		String rem = array[0];
		array[0] = array[1];
		size--;
		return rem;
	}
	
	public String peek()
	{
		return array[0];
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
