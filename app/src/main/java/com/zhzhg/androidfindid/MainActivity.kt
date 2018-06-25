package com.zhzhg.androidfindid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhzhg.androidfindid.butterknife.ButterknifeActivity
import com.zhzhg.androidfindid.innerclass.InnerClassActivity
import com.zhzhg.androidfindid.kotlin.KotlinActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnInnerClass.setOnClickListener{
            val intent=Intent(this,InnerClassActivity::class.java)
            startActivity(intent)
        }


        btnButterknife.setOnClickListener{
            val intent=Intent(this,ButterknifeActivity::class.java)
            startActivity(intent)
        }

        btnKotlin.setOnClickListener{
            val intent=Intent(this,KotlinActivity::class.java)
            startActivity(intent)
        }


    }

}
