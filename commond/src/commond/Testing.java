package commond;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Testing {
	
	static Date date;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=2;
		float c=(float)x/y;
		
		   try {
			System.out.println("jkhjkwre"+getDifference());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		String str_date="07"+"-"+"06"+"-"+"2016";
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		try {
			date = (Date)formatter.parse(str_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			   System.out.print(e.toString());
		} 
		long output=date.getTime()/1000L;
		String str=Long.toString(output);
		long timestamp = Long.parseLong(str) * 1000;
		
	   System.out.print(timestamp+"hgjh");

	}
	
	public static long getDifference() throws ParseException
	{
	    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
	    Date d = sdf.parse("Mon May 27 11:46:15 IST 2013");

	    Calendar c = Calendar.getInstance();
	    c.setTime(d);
	    long time = c.getTimeInMillis();
	    long curr = System.currentTimeMillis();
	    long diff = curr - time;    //Time difference in milliseconds
	    return diff/1000;
	}
	
//	public static Timestamp convertStringToTimestamp(String str_date) {
//	    try {
//	      DateFormat formatter;
//	      formatter = new SimpleDateFormat("dd/MM/yyyy");
//	      Date date = (Date) formatter.parse(str_date);
//	      java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());
//
//	      return timeStampDate;
//	    } catch (ParseException e) {
//	      System.out.println("Exception :" + e);
//	      return null;
//	    }
//	  }



}
