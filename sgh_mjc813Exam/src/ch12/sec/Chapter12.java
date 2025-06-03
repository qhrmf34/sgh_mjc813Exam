package ch12.sec;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Chapter12 {

    public static void main(String[] args) {
        String data=new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(3, 4)
                .toString();
        System.out.println(data);
        Calendar now= Calendar.getInstance();

        int year=now.get(Calendar.YEAR);
        int month=now.get(Calendar.MONTH)+1;
        int day=now.get(Calendar.DAY_OF_MONTH);
        int week=now.get(Calendar.DAY_OF_WEEK);
        String strWeek=null;
        switch (week) {
            case Calendar.MONDAY: strWeek="월"; break;
            case Calendar.TUESDAY: strWeek="화"; break;
            case Calendar.WEDNESDAY: strWeek="수"; break;
            case Calendar.THURSDAY: strWeek="목"; break;
            case Calendar.FRIDAY: strWeek="금"; break;
            case Calendar.SATURDAY: strWeek="토"; break;
            default: strWeek="일"; break;
        }
        int amPm=now.get(Calendar.AM_PM);
        String strAmPm=null;
        if (amPm==Calendar.AM) {
            strAmPm="오전";
        }else{
            strAmPm="오후";
        }
        int hour=now.get(Calendar.HOUR);
        int minute=now.get(Calendar.MINUTE);
        int second=now.get(Calendar.SECOND);

        System.out.print(year+"년 ");
        System.out.print(month+"월 ");
        System.out.println(day+"일 ");
        System.out.print(strWeek+"요일 ");
        System.out.println(strAmPm+" ");
        System.out.print(hour+"시 ");
        System.out.print(minute+"분 ");
        System.out.println(second+"초 ");
        LocalDateTime lnow= LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("현재 시간: "+lnow.format(dtf));

        LocalDateTime result1=lnow.plusYears(1);
        System.out.println("1년 덧셈: "+result1.format(dtf));
        LocalDateTime result2=lnow.minusMonths(1);
        System.out.println("2월 뺄셈: "+result2.format(dtf));
        LocalDateTime result3=lnow.plusDays(7);
        System.out.println("7일 덧셈: "+result3.format(dtf));

        LocalDateTime startDateTime=LocalDateTime.of(2021,1,1,0,0,0);
        System.out.println("시작일: "+startDateTime.format(dtf));
        LocalDateTime endDateTime=LocalDateTime.of(2021,12,31,0,0,0);
        System.out.println("종료일: "+endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)){
            System.out.println("진행 중입니다.");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.");
        }
        else if(startDateTime.isAfter(endDateTime)){
            System.out.println("종료했습니다.");
        }
        long remainYear=startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth=startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay=startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour=startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute=startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond=startDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 해: "+remainYear);
        System.out.println("남은 월: "+remainMonth);
        System.out.println("남은 일: "+remainDay);
        System.out.println("남은 시간: "+remainHour);
        System.out.println("남은 분: "+remainMinute);
        System.out.println("남은 초: "+remainSecond);
    }
}
