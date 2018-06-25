package com.zhzhg.androidfindid

import android.app.Application
import android.content.Context
import android.widget.Toast

/**
 *
 * Kotlin扩展函数
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/25 上午10:19
 * @project_name AndroidFindId
 * @version 1.0.0
 *
 */

fun Context.showToast(content:String,context:Context) :Toast{
    val toast:Toast=Toast.makeText(context,content,Toast.LENGTH_SHORT)
    toast.show()
    return toast
}