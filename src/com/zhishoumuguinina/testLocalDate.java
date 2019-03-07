package com.zhishoumuguinina;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author 赵鑫
 * @create 2019-03-07 11:09
 */
public class testLocalDate {
    public static void main(String[] args) {
        /**
         * of()基于参数构造对象
         */
        LocalDate localDate = LocalDate.of(2016, 3, 7);
        LocalDate localDate1 = localDate.now();
        Date date = new Date();
        System.out.println("新的api："+localDate1);
        System.out.println("原来的："+date);

        /**
         * 测试ChronoField
         */
        LocalDate now = LocalDate.now();
//       ALIGNED_DAY_OF_WEEK_IN_MONTH 以这个月的第一天对齐，开始数周数。当前日期是当前周的第几天
        System.out.println("意会就好了"+now.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));

        /**
         * 测试with方法
         * 基于日期对象修改其对应位置
         */
        System.out.println("当前时间：" + now);
        System.out.println(now.with(ChronoField.DAY_OF_MONTH, 1));
        System.out.println(now.withDayOfMonth(1));

        /**
         * 测试日期解析
         * java.time.format.DataTimeFormatter
         */
//        将字符串解析为日期
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String d = "2016-02-03";
        LocalDate ld = LocalDate.parse(d, df);
        System.out.println("解析之后的日期为：" + ld);

//        将日期格式化为字符串
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yy/MM/dd");
        String d2 = ld.format(df2);
        System.out.println("格式化之后的日期为：" + d2);

        /**
         * 测试until
         */
        LocalDate test = LocalDate.of(2019, 11, 30);
        System.out.println("距离考研还有" + now.until(test, ChronoUnit.DAYS) + "天");
    }
}
