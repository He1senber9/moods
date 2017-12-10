/**
 * Copyright (C), 2015-2017
 * FileName: DateUtils
 * Author:   fanyun
 * Date:     2017/12/2 19:09
 * Description: 框架内日期处理工具
 */
package club.vann.springframework.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *
 * @author fanyun
 * @create 2017/12/2
 * @since 1.0.0
 */
public class DateUtils {
    public static final String DATE_TYPE_YYYYMMDD = "yyyyMMdd";
    public static final String DATE_TYPE_YYYY_MM_DD = "yyyy-MM-dd";
    /**
     * 获取系统当前时间，格式为 long
     * @return
     */
    public static long getSysCurDate(){
        return System.currentTimeMillis();
    }

    /**
     * 获取默认格式下的系统时间。
     * @return
     */
    public static String getSysCurDateStr(){
        return getSysCurDateStr(DATE_TYPE_YYYYMMDD);
    }

    /**
     * 根据格式获取当前系统时间。
     *
     * @param pattern
     * @return
     */
    public static String getSysCurDateStr(String pattern){
        SimpleDateFormat simpleDateFormate = new SimpleDateFormat(pattern);
        Date date = new Date();
        return simpleDateFormate.format(date);
    }

    public static java.sql.Date date2SqlDate(){
        return null;
    }
}
