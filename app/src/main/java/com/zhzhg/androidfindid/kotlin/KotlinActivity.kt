package com.zhzhg.androidfindid.kotlin

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import com.zhzhg.androidfindid.R
import com.zhzhg.androidfindid.showToast
import kotlinx.android.synthetic.main.activity_kotlin.*
/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/25 上午9:52
 * @project_name AndroidFindId
 * @version 1.0.0
 *
 */
class KotlinActivity: Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        btnKotlinOnclick.setOnClickListener{
            txtKotlin.text="按钮点击事件"
            showToast("按钮点击事件",this)
        }
    }



}