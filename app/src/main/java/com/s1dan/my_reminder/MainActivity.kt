package com.s1dan.my_reminder

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val notifBuilder = NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(getString(R.string.reminder))
            .setContentText(getString(R.string.notification))
            .setAutoCancel(true)

        val notification = notifBuilder.build()
        val notificationManager = getSystemService(Context.)
    }
}