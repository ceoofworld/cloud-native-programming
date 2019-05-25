package com.ibksplatform.cloudstudy.stockcafe.service.stock.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
    private static Date date;
    private static Calendar cal;
    private static String result;
    private static String format_yyyyMMdd = "yyyyMMdd";
    private static SimpleDateFormat formatter;
    private static Locale nation = new Locale("ko", "KOREA");

    public static String getCurrentDate() {
        date = new Date();
        cal = Calendar.getInstance();
        cal.setLenient(true);
        cal.setTime(date);

        formatter = new SimpleDateFormat(format_yyyyMMdd, nation);
        result = formatter.format(date);
        return result;
    }
}
