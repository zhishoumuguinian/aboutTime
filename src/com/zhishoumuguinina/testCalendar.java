package com.zhishoumuguinina;

import com.zhishimuguinian.entity.testEntity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;

/**
 * @author 赵鑫
 * @create 2019-03-07 9:56
 */
public class testCalendar {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        创建开始时间
        var beginTime = Calendar.getInstance();
        beginTime.set(2019, 8, 8, 20, 56, 0);
        System.out.println("beginTime：" + sf.format(beginTime.getTime()));

//        创建结束时间
        Calendar endTime = (Calendar) beginTime.clone();
        endTime.add(Calendar.HOUR, 2);

//        getTime()将calendar转换为time
        System.out.println("beginTime：" + sf.format(beginTime.getTime()));
        System.out.println("endTime: " + sf.format(endTime.getTime()));

//        创建对象
        testEntity test = new testEntity(beginTime, endTime, "java程序设计");
        beginTime.setFirstDayOfWeek(0);
        System.out.println(endTime.getFirstDayOfWeek());

        /**
         * 测试after和before方法
         */
        System.out.println(beginTime.before(endTime));
        System.out.println(beginTime.after(endTime));



    }

}
