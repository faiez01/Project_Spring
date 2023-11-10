package Main;

public class LeapYear {
	public boolean isLeapyear(int year)
	{
	if (year%400==0)
	return true;
	if(year%100==0)
	return false;
	return (year%4==0)?true:false;
	}
}
