package Project;

public enum DayOfWeek {
	
	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3),
	THURSDAY(4),
	FRIDAY(5),
	SATURDAY(6),
	SUNDAY(7);
	
	private int day;
	
	private DayOfWeek(int dayValue)
	{
		this.day = dayValue;
	}
	
	public static DayOfWeek getDay(int d)
	{
		switch(d)
		{
		case 1: return MONDAY;
		case 2: return TUESDAY;
		case 3: return WEDNESDAY;
		case 4: return THURSDAY;
		case 5: return FRIDAY;
		case 6: return SATURDAY;
		case 7: return SUNDAY;
		default: return null;
		}
	}
	
	public String toString()
	{
		switch(day)
		{
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		case 7: return "Sunday";
		default: return null;
		}
	}
	
	public int numberOfLetters;
	
	public String toString(int numberOfLetters)
	{
		char[] arr = getDay(day).toString().toCharArray();
		String result = "";
		if(numberOfLetters <= arr.length)
		{
			for(int i = 0; i < numberOfLetters; i++)
			{
				result = result + arr[i];
			}
		}
		else System.out.println("Invalid value");
		return result;
	}

}
