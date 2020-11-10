package Project;

public class DateMain {
	
	public static void outputSort(Date[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void sort(Date[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - 1; j++)
			{
				if(arr[j].compareTo(arr[j + 1]) == 1)
				{
					Date temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		outputSort(arr);
	}

	public static void main(String[] args) {
		Date newDate = new Date(2, 5, 6, 10, 2, 2020);
		Date otherDate = new Date();
		
		System.out.println(newDate);
		System.out.println(otherDate);
		
		if(otherDate.compareTo(newDate) == -1) System.out.println("first date is before second");
		else if(otherDate.compareTo(newDate) == 1) System.out.println("second date is before first");
		else System.out.println("they are same");

	}

}
 