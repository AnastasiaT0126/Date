package Project;

public class Date {
	
	private int seconds;
	private int minutes;
	private int hours;
	private int days;
	private int month;
	private int year;
	
	public Date()
	{
		seconds = 0 ;
		minutes = 0;
		hours = 0;
		days = 1;
		month = 1;
		year = 2000;
	}
	
	public Date(int secondsValue, int minutesValue, int hoursValue, int daysValue, int monthValue, int yearValue)
	{
		setSeconds(secondsValue);
		setMinutes(minutesValue);
		setHours(hoursValue);
		setDays(daysValue, monthValue);
		setMonth(monthValue);
		setYear(yearValue);
		
	}
	
	public int getSeconds()
	{
		return seconds;
	}
	public void setSeconds(int secondsValue)
	{
		if(secondsValue > 0 && secondsValue < 60)
		{
			seconds = secondsValue;
		}
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	public void setMinutes(int minutesValue)
	{
		if(minutesValue > 0 && minutesValue < 60)
		{
			minutes = minutesValue;
		}
	}
	
	public int getHours()
	{
		return hours;
	}
	public void setHours(int hoursValue)
	{
		if(hoursValue > 0 && hoursValue < 24)
		{
			hours = hoursValue;
		}
	}
	
	public int getDays()
	{
		return days;
	}
	public void setDays(int daysValue, int monthValue)
	{
		if(monthValue == 2)
		{
			if(isLeap())
			{
				if(daysValue > 0 && daysValue < 30)
				{
					days = daysValue;
				}
			}
			else if(daysValue > 0 && daysValue < 29)
			{
				days = daysValue;
			}
		}
		else if(monthValue == 1 || monthValue == 3 || monthValue == 5 || monthValue == 7 || monthValue == 8 || monthValue == 10 || monthValue == 12)
		{
			if(daysValue > 0 && daysValue < 32)
			{
				days = daysValue;
			}
		}
		else if(daysValue > 0 && daysValue < 31)
		{
			days = daysValue;
		}
	}
	
	public int getMonth()
	{
		return month;
	}
	public void setMonth(int monthValue)
	{
		if(monthValue > 0 && monthValue < 13)
		{
			month = monthValue;
		}
	}
	
	public int getYear()
	{
		return year;
	}
	public void setYear(int yearValue)
	{
		year = yearValue;
	}
	
	public boolean isLeap()
	{
		boolean leap = false;
		
		if((year % 4 == 0) && (year % 100 != 0))
		{
			leap = true;
		}
		else if((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
		{
			leap = true;
		}
		else leap = false;
		
		return leap;
	}
	
	public int compareTo(Date date)
	{
		if(year == date.year && month == date.month && days == date.days && 
				hours == date.hours && minutes == date.minutes && seconds == date.seconds)
		{
			return 0;
		}
		else
		{
			if(year > date.year) return 1;
			else if(year == date.year)
			{
				if(month > date.month) return 1;
				else if(month == date.month)
				{
					if(days > date.days)return 1;
					else if(days == date.days)
					{
						if(hours > date.hours)return 1;
						else if(hours == date.hours)
						{
							if(minutes > date.minutes)return 1;
							else if(minutes == date.minutes)
							{
								if(seconds > date.seconds)return 1;
							}
						}
					}
				}
			}
		}
		return -1;
	}
	
	public int currentDay()
	{
		if(month == 1)
		{
			return days;
		}
		int currentDay = 0;
		
		for(int i = 1; i < month; i++)
		{
			if(i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 )
			{
				currentDay = currentDay + 31;
			}
			else currentDay = currentDay + 30;
		}
		currentDay = currentDay + days;
		
		return currentDay;
	}
	
	public int currentWeek()
	{
		int currentDay = currentDay();
		int currentWeek = currentDay / 7;
		return currentWeek;
	}
	
	public String toStringEvent()
	{
		String result = days + "/" + month + "/" + year + " " + hours + ":" + minutes ;
		return result;
	}
	
	public boolean equalDates(Date date)
	{
		if((this.days == date.days) && (this.month == date.month) && (this.year == date.year))
		{
			return true;
		}
		return false;
	}
}
