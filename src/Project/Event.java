package Project;

public class Event {
	private String name;
	private Date date;
	
	public Event() {
		name = "";
		date = new Date();
	}

	public Event(String name, Date date) {
		if (date != null)
		{
			this.date = date;
		}
		if (name != null && !name.isEmpty())
		{
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public String toString() {
		String result = date.toStringEvent() + name;
		return result;
	}

}
