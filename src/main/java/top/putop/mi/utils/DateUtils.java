package top.putop.mi.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils {

    public static String FORMAT_YYYY_MM_DDTHHMMSS = "yyyy-MM-dd'T'HH:mm:ss";
    public static String FORMAT_yyyyMMdd = "yyyyMMdd";
    public static String FORMAT_yyyy = "yyyy";

    /**
     * 字符串格式换成日期
     * @param dateString
     * @param parseFormat
     * @return
     * @throws ParseException
     */
    public static Date parse(String dateString,String parseFormat) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parseFormat);
        return simpleDateFormat.parse(dateString);
    }

    /**
     * 格式换日期变成字符串
     * @param date
     * @param parseFormat
     * @return
     * @throws ParseException
     */
    public static String format(Date date,String parseFormat) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parseFormat);
        return simpleDateFormat.format(date);
    }
}
