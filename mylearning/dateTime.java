import java.util.Calendar;
import java.util.Date;
public class dateTime {

	public static void main(String[] args) {
		Date d1 = new Date(); //current date and time
		System.out.println(d1);
		Date d2 = new Date(234567890); //jan 1 1970+ 234567890milliseconds
		System.out.println(d2);
		Date d3 = new Date(123,8,15);
		System.out.println(d3);
		boolean a1 = d3.before(d1);
		int a2 = d3.compareTo(d1);
		System.out.println(a2);
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.MONTH, 10); 
		c1.set(Calendar.DATE, 11);
		c1.set(Calendar.YEAR, 2000);
		System.out.println(c1);
		System.out.println(c1.getTime()); 
		d1.setTime(100000);
		System.out.println(d1);
	}

}
