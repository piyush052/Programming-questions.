import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Timestamp tsp = new Timestamp(System.currentTimeMillis());
		   java.util.Date temp = new java.util.Date(tsp.getTime());

        int dayMonth=temp.getDate();
        int dayWeek=temp.getDay();
        int hour=temp.getHours();
        int minute=temp.getMinutes();
        int month=temp.getMonth()+1;
        int year=temp.getYear()+1900;
        System.out.print(""+dayMonth+" "+dayWeek+" "+hour+" "+minute);



	}

}
