package hello;

import java.util.Calendar;
import java.util.Date;

public class T2 {
	public void test() {
		System.out.println(TBerry.class.getName());
		System.out.println("可以了！");
	}
	
	public static void main(String[] args) {
		 Date date = new Date();
		 Calendar c1 = Calendar.getInstance();
		 int day = c1.getFirstDayOfWeek();
		 System.out.println(day);
	}
}
