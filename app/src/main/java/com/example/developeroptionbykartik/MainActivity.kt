package com.example.developeroptionbykartik

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.app.AlarmManager
import android.provider.AlarmClock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button>(R.id.button_go_to_developer_options)
        button.setOnClickListener {
            val intent = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)
            startActivity(intent)
        }
        val button1=findViewById<Button>(R.id.button_about_phone)
            button1.setOnClickListener{
                val intent1=Intent(Settings.ACTION_DEVICE_INFO_SETTINGS)
//                val intent2 = Intent(AlarmClock.ACTION_SET_ALARM).apply {
//                    putExtra(AlarmClock.EXTRA_MESSAGE, "Set alarm")
//                    putExtra(AlarmClock.EXTRA_HOUR, 7)
//                    putExtra(AlarmClock.EXTRA_MINUTES, 30)
//                }

                startActivity(intent1)

            }
    }
}