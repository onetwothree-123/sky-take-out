package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)//指定注解只能加在方法上
@Retention(RetentionPolicy.RUNTIME)//作用时间
public @interface AutoFill {
    //指定当前数据库操作的类型:UPDATE INSERT封装在OperationType类中
    OperationType value();
}
