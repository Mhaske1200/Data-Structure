package Question_04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Time {

	public static void main(String[] args) 
	{
		SimpleDateFormat s= new SimpleDateFormat();
		System.out.println(s.format(Calendar.getInstance().getTime()));
				
		
		Calendar cal = Calendar.getInstance();
		System.out.println("Current week of year is : " +cal.get(Calendar.WEEK_OF_YEAR));
	    System.out.println("Current week of month is : " +cal.get(Calendar.WEEK_OF_MONTH));
		
	    
	    
	    SimpleDateFormat formatter1= new SimpleDateFormat("dd MMM yyyy HH:mm:ss a");
	    Date d1 = new Date();	    
	    System.out.println(formatter1.format(d1));
	    
	}

}
