package com.example.flutter_sample_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)

        openFlutterActivityButton.setOnClickListener {
            startActivity(Intent(this, SampleFlutterActivity::class.java))
        }

        openFragmentActivityButton.setOnClickListener {
            startActivity(Intent(this, SampleFragmentActivity::class.java))
        }
    }
}
