package cn.nstl.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenpeng on 2016-04-17.
 */
public class DateUtils {

    public static final String DEFAULT_VALID_TIME = "2099-12:30 00:00:00";

    final static public String FULL_ST_FORMAT = "yyyy-MM-dd HH:mm:ss";


    final static public String FULL_J_FORMAT = "yyyy/MM/dd HH:mm:ss";
    final static public String CURRENCY_ST_FORMAT = "yyyy-MM-dd HH:mm";
    final static public String CURRENCY_J_FORMAT = "yyyy/MM/dd HH:mm";
    final static public String DATA_FORMAT = "yyyyMMddHHmmss";
    final static public String ST_FORMAT = "yyyy-MM-dd HH:mm";
    final static public String ST_CN_FORMAT = "yyyy年MM月dd日 HH:mm";
    final static public String CN_FORMAT = "yy年MM月dd日HH:mm";
    final static public String DAY_FORMAT = "yyyy-MM-dd";
    final static public String SHORT_DATE_FORMAT = "yy-MM-dd";
    final static public String YEAR_FORMAT = "yyyy";
    private static SimpleDateFormat yyyyMMdd_HHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 获取当前时间
     * @return
     */
    public static String getNow(){
        return DateTime.now().toString(DateTimeFormat.forPattern(ST_FORMAT));
    }

    public static int getSeconds(){
        return (int)(DateTime.now().getMillis()/1000);
    }

    public static String getNow(String format){
        return DateTime.now().toString(DateTimeFormat.forPattern(format));
    }


    /**
     * 获取当前时间
     * @return
     */
    public static String getString(DateTime dt){
        return dt.toString(DateTimeFormat.forPattern(ST_FORMAT));
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getFullString(DateTime dt){
        return dt.toString(DateTimeFormat.forPattern(FULL_ST_FORMAT));
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getFullStringByDate(Date dt){
        return yyyyMMdd_HHmmss.format(dt);
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getString(Date d){
        DateTime dt = new DateTime(d);
        return dt.toString(DateTimeFormat.forPattern(ST_FORMAT));
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getDayString(DateTime dt){
        return dt.toString(DateTimeFormat.forPattern("yyyy-MM-dd"));
    }


    /**
     * 将字符串转为DateTime
     * @param datestr
     * @return
     */
    public static DateTime getDateTime(String datestr){

        DateTimeFormatter df = DateTimeFormat.forPattern(ST_FORMAT);
        DateTime d = df.parseDateTime(datestr);

        return d;

    }

    /**
     * 将字符串转为DateTime
     * @param datestr
     * @return
     */
    public static DateTime getDateTime(String datestr,String format){

        DateTimeFormatter df = DateTimeFormat.forPattern(format);
        DateTime d = df.parseDateTime(datestr);

        return d;

    }

    /**
     * 当前时间加天数
     * @param days
     * @return
     */
    public static DateTime afterNdays(int days){
        return DateTime.now().plusDays(days);
    }

    /**
     * 当前时间加天数
     * @param hours
     * @return
     */
    public static DateTime afterNHours(int hours){
        return DateTime.now().plusHours(hours);
    }


    /**
     * 格式转换
     */
    public static String convertFormat(String date,String oldFrmat,String newFormat){
        DateTime dt = getDateTime(date,oldFrmat);
        return dt.toString(DateTimeFormat.forPattern(newFormat));
    }

    /**
     *通过秒数获取时间字符串
     * @param seconds
     * @return
     */
    public static String getStringBySecond(int seconds){

        long t = ((long)seconds)*1000;
        DateTime dt = new DateTime(t);
        return dt.toString(DateTimeFormat.forPattern(FULL_ST_FORMAT));
    }
    /**
     *通过毫秒数获取时间字符串
     * @param millisecond 毫秒数
     * @return
     */
    public static String getStringByMilliSecond(long millisecond){
        DateTime dt = new DateTime(millisecond);
        return dt.toString(DateTimeFormat.forPattern(FULL_ST_FORMAT));
    }


    public static void main(String[] args) {
        String time = getStringBySecond(1450143007);
        System.out.print(time);
    }

    public static String dateFormat(String dateTime,String format) throws Exception{
        SimpleDateFormat fmt = new SimpleDateFormat(format); //创建要显示的日期格式
        //注意了，这里的   MM 在java中代表月份，而  mm 代表分钟， HH 代表24小时制的时间， hh 代表12小时制的时间,很严格的
        Date date = fmt.parse(dateTime);      //将从数据库读出来的 timestamp 类型的时间转换为java的Date类型
        String s = fmt.format(date);
        return s;
    }

    public static  String addDay(String date,Integer dayNum,String format) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date dt=sdf.parse(date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.DATE,dayNum);
        Date dt1=rightNow.getTime();
        String reStr = sdf.format(dt1);
        return reStr;
    }

    /**
     * 获取时间差
     * @param firstTime
     * @param endTime
     * @return
     * @throws Exception
     */
    public static String getTimeDiff(String firstTime,String endTime) throws Exception{
        if(firstTime == null || firstTime.trim().isEmpty()|| endTime == null || endTime.trim().isEmpty()){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(firstTime);
        Date date2 = sdf.parse(endTime);
        long l = date2.getTime() - date1.getTime();
        long day = l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        return day + "天" + hour + "小时" + min +"分";
//                + s + "秒";
    }

    public static String getNowTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String s = df.format(new Date());// new Date()为获取当前系统时间
        return s;
    }

    /**
     * 获取时间差
     * @param type  1天数2小时数3分钟数
     * @param startTime
     * @param endTime
     * @return
     */
    public static int getTimesDiff(int type, String startTime, String endTime) {
        if (!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                long from = sdf.parse(startTime).getTime();
                long to = sdf.parse(endTime).getTime();
                int times = 0;
                if (type == 1) {
                    times = (int) ((to - from)/(1000 * 60 * 60 * 24));
                } else if (type == 2) {
                    times = (int) ((to - from)/(1000 * 60 * 60));
                } else if (type == 3) {
                    times = (int) ((to - from)/(1000 * 60));
                }
                return times;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /**
     * 获取年
     * */
    public static int getYear(){
        String now = getNow();
        String substring = now.substring(0, 4);
        return Integer.valueOf(substring);
    }


}
