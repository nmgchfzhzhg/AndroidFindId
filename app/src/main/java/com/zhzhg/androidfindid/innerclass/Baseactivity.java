package com.zhzhg.androidfindid.innerclass;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/24 下午1:07
 * @project_name AndroidFindId
 */
public abstract class Baseactivity extends Activity implements View.OnClickListener {

    public int ViewResourceId;

    protected abstract int setViewResource();

    protected abstract void initListener();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewResourceId = setViewResource();
        setContentView(ViewResourceId);

    }

    @Override
    protected void onStart() {
        super.onStart();
        initListener();
    }

    /**
     * 绑定视图
     *
     * @param cls
     * @param <T>
     * @return
     */
    protected <T> T BindView(Class<T> cls) {
        T BaseView = null;
        try {
            Constructor<T> c = cls.getDeclaredConstructor(new Class[]{this.getClass()});
            BaseView = c.newInstance(this);
            if (BaseView != null) {
                BaseView = (T) ViewControl.getInstance(getWindow().getDecorView()).ViewBox(BaseView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return BaseView;

    }

    @Override
    public void onClick(View v) {

        String name = getResources().getResourceEntryName(v.getId());
        try {
            Method clickMethod = getClass().getDeclaredMethod(name + "_onclick", View.class);
            if (clickMethod != null){
                clickMethod.invoke(this,v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
