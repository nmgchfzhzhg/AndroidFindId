package com.zhzhg.androidfindid.butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 点击事件
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/24 下午2:50
 * @project_name AndroidFindId
 */
//设置当前注解的使用范围 使用范围的方法上
@Target(ElementType.METHOD)
//前注解声明时长 虚拟机
@Retention(RetentionPolicy.RUNTIME)

public @interface OnClick {
    int value();
}
