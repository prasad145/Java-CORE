enum WeekDays
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enumeration 
{
	public static void main(String[] args)
	{
		WeekDays wd = WeekDays.SUNDAY;
		System.out.println(wd);
		
		WeekDays[] weekDay = WeekDays.values();
		
		for(WeekDays day: weekDay)
		{
			System.out.println(day);
		}
		
		wd = WeekDays.valueOf("MONDAY");
		System.out.println(wd);
	}
}
