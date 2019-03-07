package com.zhishimuguinian.entity;

import java.util.Calendar;

/**
 * @author 赵鑫
 * @create 2019-03-07 10:11
 */
public class testEntity {
    private Calendar beginTime;
    private Calendar endTime;
    private String name;

    public testEntity(Calendar beginTime, Calendar endTime, String name) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.name = name;
    }
}
