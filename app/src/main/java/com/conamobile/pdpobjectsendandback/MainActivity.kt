package com.conamobile.pdpobjectsendandback

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.conamobile.pdpobjectsendandback.mode.User

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var text1: TextView
    var LAUNCH_DETAILS = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        text1 = findViewById(R.id.text1)

        button1.setOnClickListener {
            val user = User(name = "Ushbu ma'lumot 1-Activitydan keldi")
            openDetailActivity(user)
        }

    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("user",user)
        startActivityForResult(intent, LAUNCH_DETAILS)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == LAUNCH_DETAILS){
            if (resultCode == Activity.RESULT_OK){
                var name = data?.getStringExtra("member")
                text1.text = name
            }
        }
    }
}