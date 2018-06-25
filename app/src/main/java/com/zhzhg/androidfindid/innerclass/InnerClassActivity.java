package com.zhzhg.androidfindid.innerclass;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhzhg.androidfindid.R;

/**
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/24 下午1:37
 * @project_name AndroidFindId
 */
public class InnerClassActivity extends Baseactivity {

    public class ContentView {
        public ContentView() {

        }

        public TextView txtInnerClass;
        public Button btnOnclick;
    }

    private ContentView view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = BindView(ContentView.class);
    }

    @Override
    protected int setViewResource() {
        return R.layout.activity_innerclass;
    }

    @Override
    protected void initListener() {
        view.btnOnclick.setOnClickListener(this);
    }


    /**
     * 给按钮添加点击事件
     *
     * @param v
     */
    public void btnOnclick_onclick(View v) {

        view.txtInnerClass.setText("点击按钮事件");

    }
}
