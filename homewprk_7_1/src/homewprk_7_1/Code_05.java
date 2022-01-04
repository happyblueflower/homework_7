package homewprk_7_1;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Code_05 {
	public static void main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR) + ":" + calendar.get(Calendar.MONTH) + ":" + calendar.get(Calendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(Calendar.YEAR) + ":" + calendar.get(Calendar.MONTH) + ":" + calendar.get(Calendar.DAY_OF_MONTH));
    }

}
