package com.day03;
/*
 * 已知:2000-1-1星期六
 * 求:某年的挂历
 * 1.某年有多少天
 * 2.某年某月有多少天
 * 3.某年某月是否为闰年
 * 4.某年某月的第一天星期几
 *	a.2005-5-1
 *		x=(6+n)%7
 *  b.1997-5
 *  	x=6-n%7
 *  5.某年某月的第一天到2000-1-1共有多少天
 */
public class WanNianLi {
    /*
     * 1.某年某月是否为闰年
     */
    public static boolean isLeapYear(int year) {
        boolean isOK=false;
        isOK=( year%4==0&&year%100!=0 || year%400==0 ) ? true : false ;
        //	System.out.println(year+":"+isOK);
        return isOK;
    }
    /*
     *  2.某年有多少天
     */
    public static int yearDsys(int year) {
        int days=0;
        days = isLeapYear(year) ? 366 : 365 ;
        //	System.out.println(year+":"+days);
        return days;
    }
    /*
     * 3.某年某月有多少天
     */
    public static int yearMonthDays(int year,int month) {
        int days=0;
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                days=31;
                break;
            case 4:case 6:case 9:case 11:
                days=30;
                break;
            case 2:
                days=  isLeapYear(year) ? 29 : 28;
                break;
        }
        //	System.out.println(year+"年"+month+"月有:"+days);
        return days;
    }
    /*
     * 4.某年某月的第一天到2000-1-1共有多少天
     * a.2003-5-1
     * b.1997-5-1
     */
    public static int yearMonthDayTo2000_1_1Days(int year,int month) {
        int days=0;
        //a.2003-5-1
        if(year>=2000) {
            for(int i=2000;i<year;i++) {
                days=days+yearDsys(i);
            }
            for(int j=1;j<month;j++) {
                days=days+yearMonthDays(year,j);
            }
        }else {
            //b.1997-5-1
            for(int i=year+1;i<2000;i++) {
                days=days+yearDsys(i);
            }
            for(int j=month;j<=12;j++) {
                days=days+yearMonthDays(year,j);
            }
        }
        //	System.out.println(year+"年"+month+"月到2000-1-1:"+days);
        return days;
    }
    /*
     *  5.某年某月的第一天星期几
        a.2005-5-1
             x=(6+n)%7
          b.1997-5
               x=6-n%7
           0123456
           日一二三四五六
     */
    public static int weekDay(int year,int month) {
        int weekDay=0;
        int n=yearMonthDayTo2000_1_1Days(year,month);
        if(year>=2000) {
            weekDay=(6+n)%7;
        }else {
            weekDay=6-n%7;
        }
        //	System.out.println(year+"年"+month+"月1日:星期 "+weekDay);
        return weekDay;
    }
    /*
     * 6.显示某年某月的挂历
     */

    public static void dispalyYearMonth(int year ,int month) {
        int weekDay=weekDay(year,month);
        int yearMonthDays=yearMonthDays(year,month);
        System.out.println("\t\t---"+year+"-"+month+"---");
        System.out.println("日\t一\t二\t三\t四\t五\t六\t周");
        int count=0;
        for(int j=0;j<weekDay;j++) {
            System.out.print("\t");
            count++;
        }
        for(int i=1;i<=yearMonthDays;i++) {
            System.out.print(i+"\t");
            count++;
            if(count%7==0) {
                System.out.print(z);
                z++;

                System.out.println();

            }
        }
        if(count%7!=0) {
            for(int i=0;i<(7-(count%7));i++) {
                System.out.print("\t");
            }
            if(z==53) {
                System.out.print("");
            }else
            {
                System.out.print(z);
            }
        }



    }
    /*
     * 7.显示某年的挂历
     */

    public static void displayYear(int year) {
        for(int m=1; m<=12 ;m++) {
            dispalyYearMonth(year,m);
            System.out.println();
        }
    }



    public static int ccount =0;
    public static int z=1;
    public static void main(String[] args) {
        displayYear(2019);
    }

}
