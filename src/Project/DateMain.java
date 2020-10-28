package Project;

public class DateMain {

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
 