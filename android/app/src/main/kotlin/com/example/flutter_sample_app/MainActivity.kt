package com.example.flutter_sample_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        open_flutter_activity_button.setOnClickListener {
            startActivity(Intent(this, SampleFlutterActivity::class.java))
        }

        open_flutter_fragment_button.setOnClickListener {

        }
    }
}
