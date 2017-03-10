package com.sostar.until;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by liuyang on 2017/3/9.
 */
public class MyDateUtils {

    public static Date stringToDate(String format, String dateInString) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            Date date = formatter.parse(dateInString);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long dateToLong(Date date) {
        return date.getTime();
    }

    public static String dateToString(String format, Date date) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            String dateInString = formatter.format(date);
            return dateInString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static long stringToLong(String format, String dateInString) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            Date date = formatter.parse(dateInString);
            return dateToLong(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    public static Date longToDate(String format, long dateInLong) {
        try {
            Date date = new Date(dateInLong);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String addDays(String format, String dateInString, int addDays) {
        Date date = stringToDate(format, dateInString);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, addDays);
        return dateToString(format, cal.getTime());
    }

}
