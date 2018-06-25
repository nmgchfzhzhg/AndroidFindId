package com.zhzhg.androidfindid.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.zhzhg.androidfindid.R;


/**
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/24 下午2:49
 * @project_name AndroidFindId
 */
public class ButterknifeActivity extends Activity {

    @BindView(R.id.btnButterknife)
    private Button btnButterknife;
    @BindView(R.id.txtButterknife)
    private TextView txtButterknife;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnButterknife)
    private void onClick() {
        txtButterknife.setText("按钮点击事件");
        Toast.makeText(this, "按钮点击事件", Toast.LENGTH_SHORT).show();
    }

}
