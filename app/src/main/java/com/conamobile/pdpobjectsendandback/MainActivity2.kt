package com.conamobile.pdpobjectsendandback

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var text2: TextView
    lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        text2 = findViewById(R.id.text2)
        btn2 = findViewById(R.id.btn2)

        var user = intent.getSerializableExtra("user")

        text2.text = user.toString()

        btn2.setOnClickListener {
            var intent = Intent()
            intent.putExtra("member", "Object Back Home")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }

}