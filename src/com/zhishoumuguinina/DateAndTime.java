package com.zhishoumuguinina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 赵鑫
 * @create 2019-03-07 8:42
 */
public class DateAndTime {
    public static void main(String[] args) {

        /**
         * date基于指定日期创建对象的构造函数都已经被作废了
         * 也就是说，只能系统自动分配时间
         * java.util.Date
         */
        var date = new Date();
        System.out.println("系统获得时间："+date);

        /**
         * simpleDateFormat创建一个格式化模板
         * java.text.simpleDateFormat
         */
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        format()按照模板格式化日期
        var sfDate= sf.format(date);
        System.out.println("格式化之后的日期:" + sfDate);
//        parse()将字符串解析为日期
        Date pdate = null;
        try {
            pdate = sf.parse("2016-11-12 19:30:20");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sf.format(pdate));




    }

}
