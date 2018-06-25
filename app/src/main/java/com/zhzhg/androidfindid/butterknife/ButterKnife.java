package com.zhzhg.androidfindid.butterknife;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 自定义ButterKnife类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/24 下午2:53
 * @project_name AndroidFindId
 */
public class ButterKnife {

    public static void bind(Activity activity)  {
        try {
            bindView(activity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        bindOnClick(activity);
    }


    /**
     * 绑定点击事件
     * @param activity
     */
    private static void bindOnClick(final Activity activity) {
//        获取字节码对象
        Class<? extends Activity> cls=activity.getClass();
//        获取所有的方法 返回数组
        Method[] declaredMethods=cls.getDeclaredMethods();
//        遍历所有的方法
        for(final Method method:declaredMethods){
//            允许保利反射
            method.setAccessible(true);
//            获取方法上的注解
            OnClick annotation=method.getAnnotation(OnClick.class);
            if(annotation!=null){
//                获取点击事件的view ID值
                int id=annotation.value();
                View view=activity.findViewById(id);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
//
                            method.invoke(activity,null);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }

    }

    /**
     * 绑定View
     *
     * @param activity
     */
    private static void bindView(Activity activity) throws IllegalAccessException {
//       获取外部传进来的Activity的字节码
        Class<? extends Activity> cls = activity.getClass();
//       获取activity中的变量   这里返回的是数组 所有字段
        Field[] declaredFields = cls.getDeclaredFields();

        for (Field field : declaredFields) {
//           允许暴力反射
            field.setAccessible(true);
//           获取变量上的自定义的BindView注解
            BindView annotation = field.getAnnotation(BindView.class);

            if (annotation != null) {
//                获取注解上的值
                int id = annotation.value();
//                通过id获取控件
                View view = activity.findViewById(id);
//                将控件赋值给变量
                field.set(activity, view);
            }

        }


    }
}
