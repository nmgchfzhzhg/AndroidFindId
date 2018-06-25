package com.zhzhg.androidfindid.butterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 绑定View
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/24 下午2:45
 * @project_name AndroidFindId
 */
//设置当前注解的使用范围 变量
@Target(ElementType.FIELD)
//当前注解声明时长 虚拟机
@Retention(RetentionPolicy.RUNTIME)
public @interface BindView {
    int value();
}
