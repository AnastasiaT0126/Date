package Project;

public class Reminder {
	private static int eventsSize = 30;
	
	private Event[] events;
	private int eventsIndex;
	
	public Reminder()
	{
		events = new Event[eventsSize];
		eventsIndex = 0;
	}
	
	public void addEvent(Event newEvent)
	{
		if(eventsIndex >= eventsSize)
		{
			System.out.println("Your reminder is full");
		}
		if(eventsIndex < eventsSize)
		{
			events[eventsIndex] = newEvent;
			eventsIndex++;
		}
	}
	
	public Event[] getAllEvents(Date date)
	{
		int todaysEvents = 0;
		
		for(int i = 0; i < eventsIndex; i++)
		{
			if(events[i].getDate().equalDates(date) == true)
			{
				todaysEvents++;
			}
		}
		Event[] todaysEventsArr = new Event[todaysEvents];
		
		Date currentDate;
		int index = 0;
		
		for(int i = 0; i < eventsIndex; i++)
		{
			currentDate = events[i].getDate();
			if(date.equalDates(currentDate) == true)
			{
				todaysEventsArr[index] = new Event();
				todaysEventsArr[index] = events[i];
				index++;				
			}
		}
		return todaysEventsArr;
	}
}
