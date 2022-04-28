package src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatDemo {



    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        //设置月份，因月份从0开始，所以用 month-1
        calendar.set(2019, Calendar.UNDECIMBER-1, 31);
        calendar.set(2021, 12-1, 31);
        Date strDate = calendar.getTime();
        System.out.println("strDate:" + strDate);
        DateFormat formatUpperCase = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("yyyy-MM-dd: " + formatUpperCase.format(strDate));
        formatUpperCase = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println("YYYY-MM-dd: " + formatUpperCase.format(strDate));

        /**
         * GMT+08
         * TimeZone.setDefault(TimeZone.getTimeZone("GMT+08"));
         */
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+08"));
//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //预计在夏令时 1990-04-15 00:00:00
        Date birthday = simpleDateFormat.parse("1990-04-15 00:00:00");
        String format = simpleDateFormat.format(birthday);
        System.out.println(format);
        //DateTime birthdayDt = DateTime.parse("1990-04-15 00:00:00",  DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss"));

    }

}
